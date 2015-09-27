package castspel.scala_by_example.immutableSet

/** Represent empty node.
  * Null Object for IntSet */
object EmptySet extends IntSet{

  def contains(element: Int): Boolean = false

  def include(element: Int): IntSet =
    new NonEmpty(element, EmptySet, EmptySet)

  def union(other: IntSet) = other

  override def toString = "-"
}