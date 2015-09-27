package castspel.scala_by_example;

object SortAlgorithms {

  /* QuickSort */

  def quickSort(table: Array[Int]) {

    def swap(indexFirst: Int, indexSedonc: Int) {
      val first = table(indexFirst)
      table(indexFirst) = table(indexSedonc)
      table(indexSedonc) = first
    }

    def quickSortHelper(lowerBound: Int, upperBound: Int) {
      val pivotValue = table((lowerBound + upperBound)/2)
      var indexBiggerThanPivot = lowerBound
      var indexLowerThanPivot = upperBound

      while(indexBiggerThanPivot <= indexLowerThanPivot) {
        while (table(indexBiggerThanPivot) < pivotValue) indexBiggerThanPivot += 1
        while (table(indexLowerThanPivot) > pivotValue) indexLowerThanPivot -= 1

        if(indexBiggerThanPivot <= indexLowerThanPivot) {
          swap(indexBiggerThanPivot, indexLowerThanPivot)
          indexBiggerThanPivot += 1
          indexLowerThanPivot -= 1
        }
      }
      if(lowerBound < indexLowerThanPivot) quickSortHelper(lowerBound, indexLowerThanPivot)
      if(indexLowerThanPivot < upperBound) quickSortHelper(indexBiggerThanPivot, upperBound)
    }
    quickSortHelper(0, table.length - 1)
  }

  /*
  def main(args: Array[String]) {
    print(sort(List(1, 5, 90, 0)))
  }
  */

  /* Insertion Sort */
  def insertionSort(xs: List[Int]): List[Int] = xs match {
    case List() => List()
    case x :: xs1 => insert(x, insertionSort(xs1))
  }

  def insert(x: Int, xs: List[Int]): List[Int] = xs match {
    case List() => List(x)
    case y :: ys => if (x <= y) x :: xs else y :: insert(x, ys)
  }

  def  main (args: Array[String]) {
    val n1 = List(1, 2, 3)
    val n2 = List(4, 5)
    val n3 = List(9, 0)

    println (n1 ::: n2) // ::: list concatenation
    println (8 :: n2)
    println (n2 zip n3)
    println (n2 isEmpty)
    println (n1 head)
    println (n1 tail)
    println (n1 length)

    println (n1 take 2)
    println (n1 drop 2)
    println (n1 apply 2)
    println (n1 last)

    //    sys.error("stuff")
  }



}
