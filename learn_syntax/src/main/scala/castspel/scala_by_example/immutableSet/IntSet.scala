package castspel.scala_by_example.immutableSet

/**
 * Set for integers
 * Persistent data structure
 * NPE safe, immutable
 * Implementation: binary tree
 */
trait IntSet {

  /** Store value */
  def include(element: Int): IntSet

  /** Check if given value is inside */
  def contains(element: Int): Boolean

  /** Return set containing all elements
    * from this set and the argument set */
  def union(other: IntSet): IntSet
}
