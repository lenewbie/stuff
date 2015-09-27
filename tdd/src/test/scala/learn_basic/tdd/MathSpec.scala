package learn_basic.tdd

import org.scalatest.{Matchers, FlatSpec}

class MathSpec extends FlatSpec with Matchers {

  "even" should "confirm 2" in {
    MathFun.even(2) should be(true)
  }

  it should "confirm 1" in {
    MathFun.even(4) should be(true)
  }

  it should "reject 1" in {
    MathFun.even(1) should be(false)
  }

  it should "reject 3" in {
    MathFun.even(3) should be(false)
  }

  it should "confirm even n and reject n+1" in {
    MathFun.even(100) should be(true)
    MathFun.even(100 + 1) should be(false)
  }
}
