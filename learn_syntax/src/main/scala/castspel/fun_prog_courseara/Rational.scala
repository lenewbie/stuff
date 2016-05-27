package castspel.fun_prog_courseara

import scala.annotation.tailrec

object Rational {
  @tailrec
  private def gcd(a: Int, b: Int): Int =
    if(b == 0) a else gcd(b, a % b)

  def apply(x: Int) =
    apply(x, 1)

  def apply(x: Int, y: Int) = {
    require(y != 0, "denominator must be nonzero")

    val g = gcd(x, y)
    new Rational(x / g, y / g)
  }
}

class Rational private(val numer: Int, val denom: Int) {
  import castspel.fun_prog_courseara.Rational._

  def +(that: Rational): Rational =
    Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom)

  def *(that: Rational): Rational =
    Rational(
      numer * that.numer,
      denom * that.denom)

  def unary_- : Rational =
    new Rational(-numer, denom)

  def -(that: Rational): Rational =
    this + (-that)

  def < (that: Rational): Boolean =
    numer * that.denom < that.numer * denom

  def max(that:Rational): Rational =
    if(this < that) that else this

  override def toString =
    s"$numer/$denom"
}
