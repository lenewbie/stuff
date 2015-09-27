package castspel.scala_by_example;

import MathAlgorithms.powerOfTwo

object CurryingStuff {

  def sigma(f: Int => Int): (Int, Int) => Int = {

    def resultSummFunction(a: Int, b: Int): Int =
      if (a > b) 0 else f(a) + resultSummFunction(a + 1, b)

    resultSummFunction
  }

  def sumInts = sigma(x => x)

  def sumSquares = sigma(x => x * x)

  def main(args: Array[String]) {

    println(sumInts(2,3))

    println( sigma(powerOfTwo)(2,3) )
  }

  // shorter syntax

  def sigma2(f : Int => Int)(a: Int, b: Int) : Int =
    if(a > b) 0 else f(a) + sum(f)(a + 1, b)

  // tail recursion (not linear recursion)
  def sum(f: Int => Int)(a: Int, b: Int): Int = {
    def iter(a: Int, b: Int, result: Int): Int =
      if (a > b) result else iter(a + 1, b, result + f(a))
    iter(a, b, 0)
  }
}
