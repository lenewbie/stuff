package learn_basic.tdd

import org.scalatest.{Matchers, FlatSpec}

class FunProgSpec extends FlatSpec with Matchers {

  "isEmpty" should "test if list is empty" in {
    List().isEmpty should be (true)
  }

  it should "test if list is not empty" in {
    val myList = List("AM", "PM")
    myList.isEmpty should be (false)
  }

}
