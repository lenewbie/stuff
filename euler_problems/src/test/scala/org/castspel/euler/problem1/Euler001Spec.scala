package org.castspel.euler.problem1

import org.castspel.euler.problem1.Euler0001.sumFiltered
import org.castspel.euler.MathOps.isMultiple3or5

import org.scalatest.{FlatSpec, Matchers}

class Euler001Spec extends FlatSpec with Matchers {

  "sumNotFiltered" should "sum multiples of 3 and 5 belwo 10" in {
    sumFiltered(1, 10, isMultiple3or5) shouldBe 23
  }


}
