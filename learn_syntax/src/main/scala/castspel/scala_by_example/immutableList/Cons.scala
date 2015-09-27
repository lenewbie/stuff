package castspel.scala_by_example.immutableList

/**
 * https://class.coursera.org/progfun-005/lecture/75
 */
class Cons[T](val head: T, val tail: List[T]) extends List[T] {
  def isEmpty = false
  override def toString = s"($head, ${tail})"
}
