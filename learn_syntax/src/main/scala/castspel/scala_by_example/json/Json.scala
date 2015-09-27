package castspel.scala_by_example.json

/**
 * https://class.coursera.org/reactive-002/lecture/25
 */

/**
 * JSON element
 */
sealed trait Json {
  def show(): String = this match {
    case JInteger(integerNumber) => integerNumber.toString
    case JDecimal(decimalNumber) => decimalNumber.toString
    case JString(stuff) => "\"X\"".replace("X",stuff)
    case _ => ???
  }
}

case class Jseq(elems: List[Json]) extends Json
case class JObject(bindings: Map[String, Json]) extends Json
case class JDecimal (number: Double) extends Json
case class JInteger(number: Long) extends Json
case class JString(string: String) extends Json
case class JBool(bool: Boolean) extends Json
case object JNull extends Json



