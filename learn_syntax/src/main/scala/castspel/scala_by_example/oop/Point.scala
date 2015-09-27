package castspel.scala_by_example.oop

class Point(xc: Int, yc: Int) {
  var x : Int = xc;
  var y: Int = yc;

  def move(dx:Int, dy: Int) = {
    y += dy;
    x += dx;
    println( s"Point x location : $x")
    println( s"Point y location : $y")
  }

}