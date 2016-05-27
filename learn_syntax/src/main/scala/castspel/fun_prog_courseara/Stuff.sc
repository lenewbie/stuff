import scala.annotation.tailrec

@tailrec
def gcd(a: Int, b: Int): Int =
  if(b == 0) a else gcd(b, a % b)

def factorialOld(n: Int): Int =
  if (n <= 1) 1
  else n * factorialOld(n - 1)

def factorial(n: Int): Int = {
  @tailrec
  def loop(currN: Int, acc: Int): Int =
    if (currN <= 1) acc
    else loop(currN -1, acc * currN)

  loop(n, 1)
}

def cube(x: Int): Int = x * x * x

def id(x: Int): Int = x

object RegularFunctions {

  def sumInts(a: Int, b: Int): Int =
    if (a > b) 0 else a + sumInts(a + 1, b)

  def sumCubes(a: Int, b: Int): Int =
    if (a > b) 0 else cube(a) + sumCubes(a + 1, b)

  def sumFactorials(a: Int, b: Int): Int =
    if (a > b) 0 else factorial(a) + sumFactorials(a + 1, b)
}

gcd(14, 21)

cube(1)

cube(2)

RegularFunctions.sumCubes(1, 3)

object HoF_Functions {

  def sigma(f: Int => Int, a: Int, b: Int): Int =
    if(a > b) 0
    else f(a) + sigma(f, a + 1, b)

  def sumInts(a: Int, b: Int): Int =
    sigma(identity, a, b)

  def sumCubes(a: Int, b: Int): Int =
    sigma(cube, a, b)

  def sumFactorials(a: Int, b: Int): Int =
    sigma(factorial, a, b)
}

object HoF_Functions_With_AnonymousFun {
  // no need to auxilar defs of id or cube
  // but it is really more readable?

  def sigma(f: Int => Int, a: Int, b: Int): Int =
    if(a > b) 0
    else f(a) + sigma(f, a + 1, b)

  def sumInts(a: Int, b: Int): Int =
    sigma(x => x, a, b)

  def sumCubes(a: Int, b: Int): Int =
    sigma(x => x * x * x, a, b)

  def sumFactorials(a: Int, b: Int): Int =
    sigma(factorial, a, b)
}

object HoF_Functions_With_AnonymousFun_With_Tailrec {
  // no need to auxilar defs of id or cube
  // but it is really more readable?

  def sigma(f: Int => Int, a: Int, b: Int): Int = {

    @tailrec
    def loop(current: Int, acc: Int): Int =
      if (current > b) acc
      else loop(current + 1, f(current) + acc)

    loop(a, 0)
  }

  def sumInts(a: Int, b: Int): Int =
    sigma(x => x, a, b)

  def sumCubes(a: Int, b: Int): Int =
    sigma(x => x * x * x, a, b)

  def sumFactorials(a: Int, b: Int): Int =
    sigma(factorial, a, b)
}

//
// currying
//

object HoF_Functions_AnonymousFun_PartialFun {

  def sigma(f: Int => Int): (Int, Int) => Int = {

    def helper(a: Int, b: Int): Int = {
      if(a > b) 0
      else f(a) + helper(a + 1, b)
    }

    helper
  }

//  def sumInts(a: Int, b: Int): Int =
  def sumInts: (Int, Int) => Int =
    sigma(x => x)

  def sumCubes: (Int, Int) => Int =
    sigma(x => x * x * x)

  def sumFactorials: (Int, Int) => Int =
    sigma(factorial)
}

val x = HoF_Functions_AnonymousFun_PartialFun.sigma(cube)(1, 10)


object HoF_Functions_AnonymousFun_PartialFun_Sugar {

  def sigma(f: Int => Int)(a: Int, b: Int): Int =
    if(a > b) 0
    else f(a) + sigma(f)(a + 1, b)

  //  def sumInts(a: Int, b: Int): Int =
  def sumInts: (Int, Int) => Int =
    sigma(x => x)

  def sumCubes: (Int, Int) => Int =
    sigma(x => x * x * x)

  def sumFactorials: (Int, Int) => Int =
    sigma(factorial)
}

def capital_pi(f: Int => Int, a: Int, b: Int): Int =
  if(a > b) 1
  else f(a) * capital_pi(f, a + 1, b)

def factorialPI(n: Int): Int =
  capital_pi(id, 1, n)

factorial(2)
factorial(4)

factorialPI(2)
factorialPI(4)

def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int =
  if(a > b) zero
  else combine(f(a), mapReduce(f, combine, zero)(a + 1, b))

def capital_pi2(f: Int => Int, a: Int, b: Int): Int =
  mapReduce(f, _ * _, 1)(a, b)

def sigma2(f: Int => Int, a: Int, b: Int): Int =
  mapReduce(f, _ + _, 1)(a, b)







