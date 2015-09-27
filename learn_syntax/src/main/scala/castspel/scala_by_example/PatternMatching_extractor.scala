package castspel.scala_by_example

object PatternMatching_extractor {

  class Twice(ax: Int) {
    val x = 2* ax

    def unapply(a: Twice): Option[Int] =
      if(x % 2 == 0) Some(x/2) else None
  }

  def main(args: Array[String]): Unit = {
    val x1 = new Twice(5)
    println( x1.x )
    println
  }

}
