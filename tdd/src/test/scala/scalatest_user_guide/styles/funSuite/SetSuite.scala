package scalatest_user_guide.styles.funSuite

import org.scalatest.FunSuite

/**
 * For teams coming from xUnit,
 * FunSuite feels comfortable and familiar
 * while still giving some of the benefits of BDD:
 *  FunSuite makes it easy to write descriptive test names,
 *  natural to write focused tests,
 *  and generates specification-like output
 *  that can facilitate communication among stakeholders.
 */
class SetSuite extends FunSuite {

  test("An empty Set shoudl have size 0") {
    assert(Set.empty.size == 0)
  }

  test("Invoking head on an empty Set should produce NonSuch ElementException") {
    intercept[NoSuchElementException] {
      Set.empty.head
    }
  }

}
