package castspel.scala_by_example.immutableList

import castspel.scala_by_example.immutableList.List
import  castspel.scala_by_example.immutableList.Cons
import  castspel.scala_by_example.immutableList.Nil

object SampleUsage {

  // generic method
  def singleton[T](element: T):List[T] =
    new Cons[T](element, Nil)

  def main(args: Array[String]) = {
    println( singleton[Boolean](true) )
    println( singleton(true) )

    println( singleton(1) ) // type inference
    println( singleton[Int](42) )

    println( List.nth( 0, singleton(3) ) )

    val list_1 = Nil
    val list_2 = new Cons(2, list_1 )

    println( List.nth(0, list_2 ) )
  }

}
