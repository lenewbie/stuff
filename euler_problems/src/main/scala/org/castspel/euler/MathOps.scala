package org.castspel.euler

object MathOps {
  def isMultiple5(arg : Int) = arg % 5 == 0
  def isMultiple3(arg : Int)  = arg % 3 == 0
  def isMultiple3or5(arg : Int)  = isMultiple3(arg) || isMultiple5(arg)
  def even(n: Int): Boolean = n % 2 == 0



}
