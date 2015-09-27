package castspel.scala_by_example.oop

class Location(xc:Int, yc:Int, zc: Int) extends Point(xc, yc) {
  var z: Int = zc

  def move(dx: Int, dy: Int, dz: Int) {
    z += dz
    y += dy
    x += dx
    println(s"Point x location $x")
    println(s"Point y location $y")
    println(s"Point z location $z")
  }

}
