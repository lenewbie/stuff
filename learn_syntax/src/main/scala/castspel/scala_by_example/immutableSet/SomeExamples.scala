package castspel.scala_by_example.immutableSet

object SomeExamples extends App {
  val treeOne = new NonEmpty(3, EmptySet, EmptySet)
  val treeTwo = treeOne include 4

  println (treeOne)
  println (treeTwo)
}
