package org.castspel.unionFind

import scala.collection.mutable.MutableList


/**
 * Quick-find algorithm and data structure for dynamic connectivity problem.
 *
 * Eager algorithm for connectivity problem
 */
case class QuickFind(numberOfElements: Int) {

  private var componentOf = MutableList.tabulate(numberOfElements)(n => n)

  /** Connect two elements */
  def union(firstElement: Int, secondElement: Int): QuickFind = {
    if (componentOf(firstElement) == componentOf(secondElement)) // if not connected already
      return this;

    val firstsCompont = componentOf(firstElement)
    val secondComponent = componentOf(secondElement)
    /* internal.filter( x => x == firstsCompont ).transform( x => internal(secondElement) ) */

    for (index <- 0 to numberOfElements - 1)
      if (componentOf(index) == firstsCompont)
        componentOf(index) = secondComponent
    return this;
  }



  /** Check if two components are in the same component */
  def connected(firstElement: Int, secondElement: Int):Boolean =
    componentOf(firstElement) == componentOf(secondElement)

  /** return identifier of component for given element */
  def find(element: Int): Int = componentOf(element)

  /** Return number of components */
  def count(): Int = componentOf.toSet.size

  def print() =
    for(i <- 0 to numberOfElements-1)
      println(i + " => " + componentOf(i) )

}

