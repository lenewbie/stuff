package castspel.react.my

/**
 * https://class.coursera.org/reactive-002/lecture/111
 */
class Var[T](expr: => T) extends Signal[T](expr) {
  def update(expr: => T): Unit = ???
}

object Var {
  def apply[T](expr: => T) = new Var(expr)
}