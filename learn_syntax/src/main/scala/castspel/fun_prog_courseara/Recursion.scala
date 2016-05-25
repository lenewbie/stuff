package castspel.fun_prog_courseara

import scala.annotation.tailrec

object Recursion {

  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(s" ($col $row) ${pascal(col, row)} ")
      println()
    }
  }

  /**
    * Exercise 1
    * TODO: tailrec
    * TODO: optimize by calc only upper half
    * TODO: optimize by r=1 => r
    * TODO: optimize by explicit formula
    */
  def pascal(c: Int, r: Int): Int =
    if(c == 0) 1
    else if(r == c) 1
    else pascal(c, r-1) + pascal(c-1, r-1)


  /**
    * Exercise 2
    */
  def balance(chars: List[Char]): Boolean = {
    @tailrec
    def loop(rightParensToMatch: Int, remaining :List[Char]): Boolean = {
      if(remaining.isEmpty) rightParensToMatch == 0
      else remaining.head match {
        case '(' => loop(rightParensToMatch + 1, remaining.tail)
        case ')'=>
          if(rightParensToMatch == 0) false
          else loop(rightParensToMatch - 1, remaining.tail)
        case _ => loop(rightParensToMatch, remaining.tail)
      }
    }

    loop(0, chars)
  }

  /**
    * Exercise 3 (Frobenius coin problem)
    * TODO: check algorithms described in: https://en.wikipedia.org/wiki/Coin_problem)
    * TODO: tailrec version?
    */
  def countChange(money: Int, coins: List[Int]): Int =
    if(money == 0) 1 // money was expressed with coins
    else if(coins.isEmpty) 0 // no more coins - this did not worked
    else if(money < coins.head) countChange(money, coins.tail) // can skip this coin
    else countChange(money, coins.tail) + countChange(money - coins.head, coins)

}
