package learn_basic.tdd

/**
 * Miselous operations for Fibonacci numbers
 */
object Fibonacci {

  val first = 1
  val second = 1

  /*
  def nth(n: Int): Int =
    if(n  == 1) 1 else
      if(n == 2) 1 else
        nth(n-1) + nth(n-2)
   */

  def nth(n: Int): Int = {
    def nthHelper(i: Int, n_1: Int, n_2: Int): Int =
      if (i == n) n_1 else nthHelper(i + 1, n_1 + n_2, n_1)

    if (n == 1) first
    else if (n == 2) second
    else nthHelper(2, second, first)
  }

  def sumNth(n: Int): Int = {
    def sumNthHelper(soFar:Int, i: Int, n_1: Int, n_2: Int): Int =
      if (i == n) soFar else sumNthHelper(soFar + n_1 + n_2, i + 1, n_1 + n_2, n_1)

    if (n == 1) first
    else if (n == 2) first + second
    else sumNthHelper(2, 2, second, first)
  }

}
