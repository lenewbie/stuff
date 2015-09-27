package castspel.scala_by_example;

object NewtonSqrt {

  def abs(x: Double) = if (x >= 0) x else -x
  def square(x: Double) = x * x

  def sqrtIter(guess: Double, x: Double): Double =
    if( isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)

  def improve(guess: Double, x: Double) = (guess + x / guess) / 2

  def isGoodEnough(guess: Double, x: Double) = abs(square(guess) - x) < 0.001

  def sqrt(x: Double) = sqrtIter(1, x)

  def main(args: Array[String]) {
    val s = System.nanoTime
    println ( sqrt(4567) )
    println("time: "+(System.nanoTime-s)/1e6+"ms")

  }


}
