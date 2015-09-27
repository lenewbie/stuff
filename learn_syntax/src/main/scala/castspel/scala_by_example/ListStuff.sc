val fruit: List[String] = List("apples", "oranges", "pears")

val digit3: List[List[Int]] = List(List(1, 0, 0), List(0, 1, 0), List(0, 0, 1))
val empty: List[Int] = List()

val nums: List[Int] = List(1, 2, 3)
val nums2: List[Int] = List(4, 5)

val nums3: List[Int] = 8 :: nums2

// initial result is 1 then multiply each element with resultnt
nums.foldLeft(1)(_ * _)

// initial result is 0 then add each element to result
nums.foldLeft(0)(_ + _)

// fold examples:
// http://oldfashionedsoftware.com/2009/07/30/lots-and-lots-of-foldleft-examples/

def sum(list: List[Int]): Int = list.foldLeft(0)((r,c) => r+c)
sum( List(2, 4, 6, 8))

// sum implementedy by foldLeft with syntactic sugar
def sum2(list: List[Int]): Int = list.foldLeft(0)(_+_)

def sum3: (Int, Int) => Int = _ + _
def sumString: String => Int = _.length

def product(list: List[Int]): Int = list.foldLeft(1)(_*_)

def count(list: List[Any]): Int =
  list.foldLeft(0)((sum,_) => sum + 1)

def average(list: List[Double]): Double =
  list.foldLeft(0.0)(_+_) / list.foldLeft(0.0)((r,c) => r+1)

def average2(list: List[Double]): Double = list match {
  case head :: tail => tail.foldLeft( (head,1.0) )((r,c) =>
    ((r._1 + (c/r._2)) * r._2 / (r._2+1), r._2+1) )._1
  case Nil => NaN
}

def last[A](list: List[A]): A =
  list.foldLeft[A](list.head)((_, c) => c)

def penultimate[A](list: List[A]): A =
  list.foldLeft( (list.head, list.tail.head) )((r, c) => (r._2, c) )._1

def contains[A](list: List[A], item: A): Boolean =
  list.foldLeft(false)(_ || _==item)

def get[A](list: List[A], idx: Int): A =
  list.tail.foldLeft((list.head,0)) {
    (r,c) => if (r._2 == idx) r else (c,r._2+1)
  } match {
    case (result, index) if (idx == index) => result
    case _ => throw new Exception("Bad index")
  }






