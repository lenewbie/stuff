package castspel.scala_by_example;

object MathAlgorithms {

  def gcd(a: Int, b: Int): Int = if(b == 0) a else gcd(b, a % b)

  def factorial(n: Int): Int = if (n == 0) 1 else n * factorial(n - 1)

  def abs(x: Double) = if (x >= 0) x else -x

  def square(x: Double) = x * x

  def sqrt(x: Double) = {
    def improve(guess: Double) = (guess + x / guess) / 2

    def isGoodEnough(guess: Double) = abs(square(guess) - x) < 0.001

    def sqrtHelper(guess: Double): Double =
      if( isGoodEnough(guess)) guess
      else sqrtHelper(improve(guess))

    sqrtHelper(x * 0.5)
  }

  def square(x: Int) = x * x

  def powerOfTwo(x: Int): Int = if(x == 0) 1 else 2 * powerOfTwo(x - 1)

  def identify(x: Int) = x

}
