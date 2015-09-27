package castspel.scala_by_example;

// (x: Int) => x * x
object AnonymousFunctionStuff {

  def sigma(f: Int => Int, a: Int, b: Int): Int =
    if(a > b) 0 else f(a) + sigma(f, a + 1, b)

  def sumInts(a: Int, b: Int): Int = sigma(x => x, a, b)

  def sumSquares2(a: Int, b: Int): Int = sigma((x: Int) => x * x, a, b)

  def sumSquares(a: Int, b: Int): Int = sigma(x => x * x, a, b)
}
