val PI = 3.14

class Radius2 {
  def apply(radius: Double): Double = 2 * PI * radius
}

val radius2 = new Radius2()
radius2(2)

object Radius3 {
  def apply(radius: Double): Double = 2 * PI * radius
}
Radius3(2)
