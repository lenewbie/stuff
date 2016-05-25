package castspel.scala_by_example.immutableList

import castspel.scala_by_example.immutableList.Nil
import castspel.scala_by_example.immutableList.Cons

/**
 * https://class.coursera.org/progfun-005/lecture/75
 *
 * TODO rewrite functions to be tail recursive
 */
trait List[+T] {
  def isEmpty: Boolean
  def head: T
  def tail: List[T]
  def prepend[U >: T](elem: U): List[U] = new Cons(elem, this) // lower bound

//  def length: Int = {
//    def lengthHelper(soFar: Int, subList: List[T]): Int = subList match {
//      case Nil => soFar
//      case Cons[T](aHead, aRest) => lengthHelper(soFar + 1, aRest)
//    }
//    lengthHelper(0, this)
//  }


//  // return new collection, each element is result of function
// https://class.coursera.org/reactive-002/lecture/7
//  def map[U](transformation: T => U): List[U] = this match {
//    case aHead :: aRest => transformation(aHead) :: aRest.map(transformation)
//    case Nil => Nil
//  }

//  // return new map with elements fullfiling predicate
//  // https://class.coursera.org/reactive-002/lecture/7
//  def filter(p: T => Boolean): List[T] = this match {
//    case x :: xs =>
//      if(p(x)) x :: xs.filter(p) else xs.filter(p)
//    case Nil => Nil
//  }


}

object List {

  // returh nth element of the list
  def nth[T](n: Int, list: List[T]): T = {
    if(list.isEmpty)  throw new IndexOutOfBoundsException()
    else if (n <= 0) list.head
    else nth(n - 1, list.tail)
  }


}
