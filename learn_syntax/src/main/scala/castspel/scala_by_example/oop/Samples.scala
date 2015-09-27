package castspel.scala_by_example.oop

object Samples {

  def main(args: Array[String]): Unit = {
    new Point(10, 20)
      .move(10, 10)

    new Location(10, 20, 30)
      .move(10, 10, 10)

  }
}
