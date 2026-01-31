package avrohugger
package format
package standard

import avrohugger.format.abstractions.ScalaTreehugger
import avrohugger.format.standard.avrohuggers.{ StandardProtocolhugger, StandardSchemahugger }
import avrohugger.format.standard.trees.Scala3EnumSourceCode
import avrohugger.matchers.TypeMatcher
import avrohugger.stores.ClassStore
import org.apache.avro.{ Protocol, Schema }
import treehugger.forest.{ Tree, TreePrinter, treehuggerDSL, show, stringToTermName }
import treehuggerDSL._

object StandardScalaTreehugger extends ScalaTreehugger {

  val schemahugger = StandardSchemahugger
  val protocolhugger = StandardProtocolhugger
  val importer = StandardImporter

  private val header = "MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY"

  private def showWithScala3Enum(tree: Tree): String =
    show(
      tree,
      out => new TreePrinter(out) {
        override def printTree(tree: Tree): Unit = tree match {
          case Scala3EnumSourceCode(code) => super.print(code)
          case tree => super.printTree(tree)
        }
      }
    )

  def asScalaCodeString(
    classStore: ClassStore,
    namespace: Option[String],
    schemaOrProtocol: Either[Schema, Protocol],
    typeMatcher: TypeMatcher,
    restrictedFields: Boolean,
    targetScalaPartialVersion: String,
  ): String = {

    val imports = importer.getImports(schemaOrProtocol, namespace, typeMatcher)

    val topLevelDefs: List[Tree] = schemaOrProtocol match {
      case Left(schema) => schemahugger.toTrees(classStore, namespace, schema, typeMatcher, None, None, restrictedFields, targetScalaPartialVersion)
      case Right(protocol) => protocolhugger.toTrees(classStore, namespace, protocol, typeMatcher, None, None, restrictedFields, targetScalaPartialVersion)
    }

    // wrap the imports and class definition in a block with comment and package
    val tree = {
      val blockContent = imports ++ topLevelDefs
      namespace match {
        case Some(ns) => BLOCK(blockContent).inPackage(ns)
        case None => BLOCK(blockContent: _*).withoutPackage
      }
    }.withDoc(header)
    // SpecificCompiler can't return a tree for Java enums, so return
    // a string here for a consistent api vis a vis *ToFile and *ToStrings
    showWithScala3Enum(tree)
  }

}
