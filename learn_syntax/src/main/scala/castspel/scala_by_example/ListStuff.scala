package castspel.scala_by_example;

object ListStuff {

  val fruit: List[String] = List("apples", "oranges", "pears")

  val digit3: List[List[Int]] = List(List(1, 0, 0), List(0, 1, 0), List(0, 0, 1))
  val empty: List[Int] = List()

  val nums: List[Int] = List(1, 2, 3)
  val nums2: List[Int] = List(4, 5)

  val nums3: List[Int] = 8 :: nums2


  print( nums2 )

}
