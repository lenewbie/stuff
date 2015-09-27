// example closure

var price = 2.50

// without any sugar (Java style)
class NoSugarFunction extends Function1[Double, Double] {
  def apply(numberOf: Double): Double = {
    return numberOf * price
  }
}
val costOfFourSugars = new NoSugarFunction().apply(4)

// with functions sugar (Scala style)
price = 2.00
def sugar(noOf: Int) = noOf * price
val costOfFourSugarsAgaing = sugar(4)


// below example is obvious
// don't use closure vaiables instead of
// normal higher order function arguments
// without a reason

var howMuchToAdd = 42
def addN(x: Int):Int = x + howMuchToAdd

val add42:(Int => Int) = addN // howMuch ToAdd can change!
add42(1)

howMuchToAdd = 2 // some evil splited personality work
add42(1) // it is  - oouch!



