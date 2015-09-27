package castspel.react.my

/**
 * https://class.coursera.org/reactive-002/lecture/111
 */
class Signal[T](expr: => T) {
  def apply(): T = ???
}

object Signal {
  def apply[T](expr: => T) = new Signal(expr)
}
