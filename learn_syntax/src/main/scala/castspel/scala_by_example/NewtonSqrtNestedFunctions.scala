package castspel.scala_by_example;

object NewtonSqrtNestedFunctions {

  def abs(x: Double) = if (x >= 0) x else -x
  def square(x: Double) = x * x

  def sqrt(x: Double) = {
    def sqrtIter(guess: Double): Double =
      if( isGoodEnough(guess, x)) guess
      else sqrtIter(improve(guess))

    def improve(guess: Double) = (guess + x / guess) / 2

    def isGoodEnough(guess: Double, x: Double) = abs(square(guess) - x) < 0.001

    sqrtIter(x * 0.5)
  }

  def main(args: Array[String]) {
    val s = System.nanoTime
    println ( sqrt(4567) )
    println("time: "+(System.nanoTime-s)/1e6+"ms")

  }

}
