package castspel.scala_by_example.immutableList

/**
 * https://class.coursera.org/progfun-005/lecture/75
 */
object Nil extends List[Nothing] {
  def isEmpty = true
  def head: Nothing = throw new NoSuchElementException("Nil.head")
  def tail: Nothing = throw new NoSuchElementException("Nil.tail")
  override def toString = "()"
}
