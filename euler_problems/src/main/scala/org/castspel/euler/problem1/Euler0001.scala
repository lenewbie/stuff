package org.castspel.euler.problem1

import org.castspel.euler.MathOps.isMultiple3or5


object Euler0001 extends App {

  // imperative solution might be better
  def sumFiltered(start: Int, end: Int, pred: (Int) => Boolean) = {
    (start until end).filter(pred).sum
  }

  val start = System.nanoTime()
  val result: Int = sumFiltered(1, 1000, isMultiple3or5) //233168
  val end = System.nanoTime()
  println( result + " computed in: " + (end-start)/10e6)

}
