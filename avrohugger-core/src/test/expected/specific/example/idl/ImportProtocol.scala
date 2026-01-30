/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package example.idl

import scala.annotation.switch

import other.ns.{ExternalDependency, Suit}

final case class DependentRecord(var dependency: other.ns.ExternalDependency, var number: Int) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(new ExternalDependency, 0)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        dependency
      }.asInstanceOf[AnyRef]
      case 1 => {
        number
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.dependency = {
        value
      }.asInstanceOf[other.ns.ExternalDependency]
      case 1 => this.number = {
        value
      }.asInstanceOf[Int]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = example.idl.DependentRecord.SCHEMA$
}

object DependentRecord {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DependentRecord\",\"namespace\":\"example.idl\",\"fields\":[{\"name\":\"dependency\",\"type\":{\"type\":\"record\",\"name\":\"ExternalDependency\",\"namespace\":\"other.ns\",\"fields\":[{\"name\":\"number\",\"type\":\"int\"}]}},{\"name\":\"number\",\"type\":\"int\"}]}")
}

final case class DependentRecord2(var dependency: Suit, var name: String) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(null, "")
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        dependency
      }.asInstanceOf[AnyRef]
      case 1 => {
        name
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.dependency = {
        value
      }.asInstanceOf[Suit]
      case 1 => this.name = {
        value.toString
      }.asInstanceOf[String]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = example.idl.DependentRecord2.SCHEMA$
}

object DependentRecord2 {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DependentRecord2\",\"namespace\":\"example.idl\",\"fields\":[{\"name\":\"dependency\",\"type\":{\"type\":\"enum\",\"name\":\"Suit\",\"namespace\":\"other.ns\",\"symbols\":[\"SPADES\",\"DIAMONDS\",\"CLUBS\",\"HEARTS\"]}},{\"name\":\"name\",\"type\":\"string\"}]}")
}

final case class DependentRecord3(var dependency: example.idl.Embedded, var value: Boolean) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(new Embedded, false)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        dependency
      }.asInstanceOf[AnyRef]
      case 1 => {
        value
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.dependency = {
        value
      }.asInstanceOf[example.idl.Embedded]
      case 1 => this.value = {
        value
      }.asInstanceOf[Boolean]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = example.idl.DependentRecord3.SCHEMA$
}

object DependentRecord3 {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DependentRecord3\",\"namespace\":\"example.idl\",\"fields\":[{\"name\":\"dependency\",\"type\":{\"type\":\"record\",\"name\":\"Embedded\",\"fields\":[{\"name\":\"inner\",\"type\":\"int\"}]}},{\"name\":\"value\",\"type\":\"boolean\"}]}")
}