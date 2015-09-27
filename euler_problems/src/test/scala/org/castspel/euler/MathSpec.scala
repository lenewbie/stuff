package org.castspel.euler

import org.castspel.euler.MathOps._
import org.scalatest.{FlatSpec, Matchers}


class MathOpsSpec extends FlatSpec with Matchers {

  "isMultiple3" should "detect numbers divisible by 3" in {
    isMultiple3(3) shouldBe true
    isMultiple3(6) shouldBe true
    isMultiple3(333) shouldBe true
  }

  it should "detect numbers not divisible by 3" in {
    isMultiple3(1) shouldBe false
    isMultiple3(2) shouldBe false
    isMultiple3(1000) shouldBe false
  }

  "isMultiple5" should "detect numbers divisible by 5" in {
    isMultiple5(5) shouldBe true
    isMultiple5(15) shouldBe true
    isMultiple5(25) shouldBe true
  }

  it should "detect numbers not divisible by 5" in {
    isMultiple5(1) shouldBe false
    isMultiple5(2) shouldBe false
    isMultiple5(333) shouldBe false
  }

}
