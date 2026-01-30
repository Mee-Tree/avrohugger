/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package example.idl.scala3enum

import other.ns.scala3enum.{ExternalDependency, Suit}

sealed trait ImportProtocol extends Product with Serializable

final case class DependentRecord(dependency: other.ns.scala3enum.ExternalDependency, number: Int) extends ImportProtocol

final case class DependentRecord2(dependency: Suit, name: String) extends ImportProtocol

final case class DependentRecord3(dependency: example.idl.scala3enum.Embedded, value: Boolean) extends ImportProtocol