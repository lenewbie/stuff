import org.scalatest.{Matchers, FlatSpec}

class ListBehaviors extends FlatSpec with Matchers {

  "isEmpty" should "test if list is empty" in {
    List().isEmpty should be (true)
  }

  it should "test if list is not empty" in {
    val myList = List("AM", "PM")
    myList.isEmpty should be (false)
  }

  "length" should "return list size" in {
    val empty = List()
    val listOfLists = List(List(1, 0, 0), List(0, 1, 0), List(0, 0, 1))

    listOfLists.length shouldBe 3
    empty.length shouldBe 0
  }

  "equals" should "detect two lists of Strings are equal" in {
    val intsOne: List[Int] = List(1, 2, 3, 4)
    val intsTwo: List[Int] = List(1, 2, 3, 4)
    assert( intsOne equals intsTwo)
    assert( ! (intsOne eq intsTwo) )
  }

  "cons" should "create identical list as List object apply" in {
    val fruit = List("apples", "oranges", "pears")
    fruit shouldBe "apples" :: "oranges" :: "pears" :: Nil
  }

}
