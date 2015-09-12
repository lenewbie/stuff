package castspel.scala_by_example;

object GreatestCommonDivisor {

  def gcd(a: Int, b: Int): Int = if(b == 0) a else gcd(b, a % b)

  def factorial(n: Int): Int = if (n == 0) 1 else n * factorial(n - 1)

  def main(args: Array[String]) {
    println( gcd(14, 21))

    println( factorial(5) )
  }

}
