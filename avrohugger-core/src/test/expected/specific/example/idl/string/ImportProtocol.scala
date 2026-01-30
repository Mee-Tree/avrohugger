/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package example.idl.string

import scala.annotation.switch

import other.ns.string.ExternalDependency

sealed trait ImportProtocol extends org.apache.avro.specific.SpecificRecordBase with Product with Serializable

final case class DependentRecord(var dependency: other.ns.string.ExternalDependency, var number: Int) extends org.apache.avro.specific.SpecificRecordBase with ImportProtocol {
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
      }.asInstanceOf[other.ns.string.ExternalDependency]
      case 1 => this.number = {
        value
      }.asInstanceOf[Int]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = example.idl.string.DependentRecord.SCHEMA$
}

final object DependentRecord {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DependentRecord\",\"namespace\":\"example.idl\",\"fields\":[{\"name\":\"dependency\",\"type\":{\"type\":\"record\",\"name\":\"ExternalDependency\",\"namespace\":\"other.ns\",\"fields\":[{\"name\":\"number\",\"type\":\"int\"}]}},{\"name\":\"number\",\"type\":\"int\"}]}")
}

final case class DependentRecord2(var dependency: String, var name: String) extends org.apache.avro.specific.SpecificRecordBase with ImportProtocol {
  def this() = this("", "")
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        new org.apache.avro.generic.GenericData.EnumSymbol(getSchema.getFields.get(field$).schema, dependency)
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
        value.toString
      }.asInstanceOf[String]
      case 1 => this.name = {
        value.toString
      }.asInstanceOf[String]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = example.idl.string.DependentRecord2.SCHEMA$
}

final object DependentRecord2 {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DependentRecord2\",\"namespace\":\"example.idl\",\"fields\":[{\"name\":\"dependency\",\"type\":{\"type\":\"enum\",\"name\":\"Suit\",\"namespace\":\"other.ns\",\"symbols\":[\"SPADES\",\"DIAMONDS\",\"CLUBS\",\"HEARTS\"]}},{\"name\":\"name\",\"type\":\"string\"}]}")
}

final case class DependentRecord3(var dependency: example.idl.string.Embedded, var value: Boolean) extends org.apache.avro.specific.SpecificRecordBase with ImportProtocol {
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
      }.asInstanceOf[example.idl.string.Embedded]
      case 1 => this.value = {
        value
      }.asInstanceOf[Boolean]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = example.idl.string.DependentRecord3.SCHEMA$
}

final object DependentRecord3 {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DependentRecord3\",\"namespace\":\"example.idl\",\"fields\":[{\"name\":\"dependency\",\"type\":{\"type\":\"record\",\"name\":\"Embedded\",\"fields\":[{\"name\":\"inner\",\"type\":\"int\"}]}},{\"name\":\"value\",\"type\":\"boolean\"}]}")
}