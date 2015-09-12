package castspel.scala_by_example;

object LIstHigherOrderFunStuff {

  def scaleList2(aList: List[Double], factor: Double): List[Double] = aList match {
    case Nil => aList
    case listHead :: listTail =>  listHead * factor :: scaleList2(listTail, factor)
  }

  // map - create new list by applying function to each element
  def scaleList(aList: List[Double], factor: Double): List[Double] =
    aList map (x => x * factor)

  //  def squareList(xs: List)


  def main(args: Array[String]): Unit = {
    println (scaleList2(List(1,2,4), 4))

    // foreach - apply function to each element (used for side effects)
    List(4,5,6) foreach (x => println(x))

    // forall - check if for all elements of list given condition is met
    println( List(2,3,4) forall (x => x >= 2))

    // exists - check if given condition is met for any element
    println( List(4,5,6) exists (x => x % 3 == 0))

    // filter - create new list with elements matching condition
    println (List(4,5,6,7,8) filter (x => x % 2 == 0) )

    // foldLeft - apply
    val numbers7 =  List(4,5,6)
    println ( numbers7.foldLeft(0)((x,y) => x + y) )
    println ( numbers7.foldLeft(0)(_ + _) )
  }

}
