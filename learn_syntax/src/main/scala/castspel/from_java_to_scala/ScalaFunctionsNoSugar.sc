// hot to progress from Java style anonymous function
// to Scala style

// without any sugar (Java style)
class NoSugarFunction extends Function1[Double, Double] {
  def apply(numberOf: Double): Double = {
    return numberOf * 2.50
  }
}
val costOfFourSugars = new NoSugarFunction().apply(4)

// with functions Scala sugar (Scala style)
def sugar(noOf: Int) = noOf * 2.50
val costOfFourSugarsAgaing = sugar(2)



