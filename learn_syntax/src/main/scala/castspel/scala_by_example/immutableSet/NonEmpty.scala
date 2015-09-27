package castspel.scala_by_example.immutableSet


/**
 * Non empty container.
 * Left have values smaller than stored
 * Right have values greater than stored
 */
class NonEmpty(val initElement: Int, val left: IntSet, val right: IntSet) extends IntSet {

  def contains(element: Int): Boolean =
    if(initElement == element) true
    else if(element < initElement ) left contains element
    else right contains element

  def include(element: Int): IntSet =
    if(initElement == element)  this
    else if(initElement < element)
      new NonEmpty(initElement, left, right include element)
    else
      new NonEmpty(initElement, left include element, right)

  def union(other: IntSet) =
    ((left union right) union other) include initElement // crazyness in here

  override def toString = s"{$left, $initElement, $right}"
}
