package castspel.scala_by_example




object NamedParameters extends App {

  def stuff(times: Int, what: Int): String = {
    List.fill(times)("" + what).mkString(", ")
  }

  println( stuff(2, 3) )
  println( stuff(times = 2, what = 3) )
  println( stuff(what = 3, times = 2) )


}
