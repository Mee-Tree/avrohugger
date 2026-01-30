/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package example.idl.string

import other.ns.string.ExternalDependency

sealed trait ImportProtocol extends Product with Serializable

final case class DependentRecord(dependency: other.ns.string.ExternalDependency, number: Int) extends ImportProtocol

final case class DependentRecord2(dependency: String, name: String) extends ImportProtocol

final case class DependentRecord3(dependency: example.idl.string.Embedded, value: Boolean) extends ImportProtocol