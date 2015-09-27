package org.castspel.euler


case class Fibonacci(FIRST: Int, SECOND: Int) {

  def sumNthIf(n: Int, f: Int => Boolean ): Int = {
    def sumNthHelper(soFar:Int, i: Int, n_1: Int, n_2: Int): Int = {
      val curr = n_1 + n_2
      if (i == n) soFar else
      if( f(curr) ) sumNthHelper(soFar + curr, i + 1,curr, n_1) else
        sumNthHelper(soFar, i + 1,curr, n_1)
    }

    if (n == 1) FIRST
    else if (n == 2) SECOND
    else sumNthHelper(2, 2, 1, 1)
  }

}
