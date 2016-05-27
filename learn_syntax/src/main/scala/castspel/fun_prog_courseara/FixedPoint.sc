val tolerance = 1e-14

def isCloseEnough(x: Double, y: Double) =
  Math.abs((x-y)/x) / x < tolerance

def fixedPoint(f: Double => Double)(firstGuess: Double) = {
  def iterate(guess: Double): Double = {
    val next = f(guess)
    if(isCloseEnough(guess, next)) next
    else iterate(next)
  }
  iterate(firstGuess)
}

fixedPoint(x => 1 + x/2)(1)

def avarageDamp(f: Double => Double)(x: Double) = (x + f(x))/2

def sqrt(x: Double) = fixedPoint(avarageDamp(y => x / y))(1.0)

sqrt(2)

Math.sqrt(2)

