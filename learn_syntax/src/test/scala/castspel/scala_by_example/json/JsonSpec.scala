package castspel.scala_by_example.json

import org.scalatest.{Matchers, FlatSpec}

class JsonSpec extends FlatSpec with Matchers {

  "show" should "display integer number as it is" in {
    val jsonNumber = JInteger(42)
    jsonNumber.show shouldBe "42"
  }

  "show" should "display decimal as it is" in {
    val jsonNumber = JDecimal(3.5)
    jsonNumber.show shouldBe "3.5"
  }

  "show" should "display string with quotes" in {
    val jsonNumber = JString("CC those fools!")
    jsonNumber.show shouldBe "\"CC those fools!\""
  }

//  "show" should "display false boolean as false" in {
//    val jsonNumber = JBool(false)
//    jsonNumber.show shouldBe "false"
//  }

//  "show" should "display true boolean as true" in {
//    val jsonNumber = JBool(true)
//    jsonNumber.show shouldBe "true"
//  }

//  "show" should "display object elements as quoted key: value" in {
//    val jsonNumber = JObject(true)
//    jsonNumber.show shouldBe "true"
//  }

}
