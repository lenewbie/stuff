package castspel.fun_prog_courseara

import org.scalatest.FunSuite

class ListUtilsTest extends FunSuite {

  import castspel.fun_prog_courseara.ListUtils._

  /**
    * Tests are written using the `test` operator which takes two arguments:
    *
    * - A description of the test. This description has to be unique, no two
    *   tests can have the same description.
    * - The test body, a piece of Scala code that implements the test
    *
    * The most common way to implement a test body is using the method `assert`
    * which tests that its argument evaluates to `true`. So one of the simplest
    * successful tests is the following:
    */
  test("one plus one is two")(assert(1 + 1 == 2))


  /**
    * In Scala, it is allowed to pass an argument to a method using the block
    * syntax, i.e. `{ argument }` instead of parentheses `(argument)`.
    *
    * This allows tests to be written in a more readable manner:
    */
  test("one plus one is three?") {
    assert(1 + 1 == 2) // This assertion fails! Go ahead and fix it.
  }


  /**
    * One problem with the previous (failing) test is that ScalaTest will
    * only tell you that a test failed, but it will not tell you what was
    * the reason for the failure. The output looks like this:
    *
    * {{{
    *    [info] - one plus one is three? *** FAILED ***
    * }}}
    *
    * This situation can be improved by using a special equality operator
    * `===` instead of `==` (this is only possible in ScalaTest). So if you
    * run the next test, ScalaTest will show the following output:
    *
    * {{{
    *    [info] - details why one plus one is not three *** FAILED ***
    *    [info]   2 did not equal 3 (ListsSuite.scala:67)
    * }}}
    *
    * We recommend to always use the `===` equality operator when writing tests.
    **/
  test("details why one plus one is not three") {
    assert(1 + 1 === 2)
  }

  /**
    * In order to test the exceptional behavior of a methods, ScalaTest offers
    * the `intercept` operation.
    *
    * In the following example, we test the fact that the method `intNotZero`
    * throws an `IllegalArgumentException` if its argument is `0`.
    */
  test("intNotZero throws an exception if its argument is 0") {
    intercept[IllegalArgumentException] {
      intNotZero(0)
    }
  }

  def intNotZero(x: Int): Int = {
    if (x == 0) throw new IllegalArgumentException("zero is not allowed")
    else x
  }


  /**
    * Now we finally write some tests for the list functions that have to be
    * implemented for this assignment. We fist import all members of the
    * `List` object.
    */


  /**
    * We only provide two very basic tests for you. Write more tests to make
    * sure your `sum` and `max` methods work as expected.
    *
    * In particular, write tests for corner cases: negative numbers, zeros,
    * empty lists, lists with repeated elements, etc.
    *
    * It is allowed to have multiple `assert` statements inside one test,
    * however it is recommended to write an individual `test` statement for
    * every tested aspect of a method.
    */
  test("sum of an empty list is 0") {
    assertSumListOfIntegers(List(), 0)
  }

  test("sum of an nil is zero") {
    assertSumListOfIntegers(null,  0)
  }

  test("sum of an single element list is equal to its element") {
    assertSumListOfIntegers(List(42), 42)
  }

  test("sum of a few numbers") {
    assertSumListOfIntegers(List(1, 2, 0), 3)
  }

  private def assertSumListOfIntegers(list: List[Int], expected: Int) =
    assert(sum(list) === expected)

  test("max of empty list is 0") {
    assertMaxListOfInts(List(), 0)
  }

  test("max of nil is 0") {
    assertMaxListOfInts(null, 0)
  }

  test("max of a few numbers") {
    assertMaxListOfInts(List(3, 7, 2), 7)
    assertMaxListOfInts(List(7, 3, 2), 7)
    assertMaxListOfInts(List(2, 3, 7), 7)
  }

  private def assertMaxListOfInts(ints: List[Int], expected: Int) =
    assert(max(ints) === expected)

}
