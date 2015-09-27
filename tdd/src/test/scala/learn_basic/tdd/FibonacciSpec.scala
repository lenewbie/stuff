package learn_basic.tdd

import _root_.org.scalatest.{FlatSpec, Matchers}

/**
 *
 */
class FibonacciSpec extends FlatSpec with Matchers {

  /*
   * 1 1 2 3 5	8	13	21	34	55	89	144	233	377	610	987	1597	2584	4181
   */

  "nth" should "return 1 when given 1" in {
    Fibonacci.nth(1) should be (Fibonacci.first)
  }

  it should "return 1 when given 2" in {
    Fibonacci.nth(2) should be (Fibonacci.second)
  }

  it should "return as 3rd element value fib(2) + fib(1)" in {
    Fibonacci.nth(3) should be (Fibonacci.first + Fibonacci.second)
  }

  it should "return as 4th element value fib(3) + fib(2)" in {
    Fibonacci.nth(4) should be (Fibonacci.nth(3) + Fibonacci.nth(2) )
  }

  it should "should return same when given n and sum n-1 and n-2" in {
    val n = 20;
    val sumFibonacciNminus1and2 = Fibonacci.nth(n-1) + Fibonacci.nth(n - 2)
    val fibonacciN = Fibonacci.nth(n)
    sumFibonacciNminus1and2 should be (fibonacciN)
  }

  "sumNth" should "return 1 when given 1" in {
    Fibonacci.sumNth(1) should be (1)
  }

  it should "return 2 when given 2" in {
    Fibonacci.sumNth(2) should be (2)
  }

  it should "return 4 when given 3" in {
    Fibonacci.sumNth(3) should be (4)
  }

}
