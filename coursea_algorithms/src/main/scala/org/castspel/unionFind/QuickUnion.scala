package org.castspel.unionFind

import scala.collection.mutable.{HashSet, MutableList}

/**
 * Quick-union algorithm and data structure for dynamic connectivity problem.
 *
 * Lazy algorithm for connectivity problem
 */
case class QuickUnion(numberOfElements: Int) {

  private var parentOf = MutableList.tabulate(numberOfElements)(x => x)

  def root(element: Int): Int =
    if (element == parentOf(element)) element
    else root(parentOf(element))

  /** Connect two elements */
  def union(firstElement: Int, secondElement: Int): QuickUnion = {
    if (root(firstElement) != root(secondElement))
      parentOf(secondElement) = root(firstElement)
    this;
  }

  /** Check if two components are in the same component */
  def connected(firstElement: Int, secondElement: Int): Boolean =
    root(firstElement) == root(secondElement)

  /** return identifier of component for given element */
  def find(element: Int): Int = root(element)

  /** Return number of components */
  def count(): Int = {
    var result:HashSet[Int] = new HashSet[Int]();
    for(n <- parentOf) result += root(n)
    result.size
  };

  override def toString():String = {
    val result = new StringBuilder()
    for (i <- 0 to numberOfElements - 1)
      result.append(i).append(" => ").append(parentOf(i))
    result.toString()
  }

}
