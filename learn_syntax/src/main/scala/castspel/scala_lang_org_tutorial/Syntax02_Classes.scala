package castspel.scala_lang_org_tutorial

/**
 * Inspired by: http://docs.scala-lang.org/tutorials/tour/classes.html
 * @author lemastero
 */
object Syntax02_Classes extends App {
  val viewPort = new Point(1,2)
  println( viewPort )
  viewPort.move(10, 10)
  println( viewPort )
}

class Point(cx: Int, cy: Int) {
  var x: Int = cx
  var y: Int = cy

  def move(xDistance:Int, yDistance:Int): Point = {
    x += xDistance
    y += yDistance
    this
  }

  override def toString(): String = s"($x, $y)" // sexy Huh :)
}
