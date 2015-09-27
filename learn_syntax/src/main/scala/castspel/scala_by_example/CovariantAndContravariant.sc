// https://class.coursera.org/progfun-005/lecture/83

// mutable types cannot be covariant or cotravariant

// covariant
// A is subtype af B
// A <: B
class Stuff[+A]

// contravariant
// A is supertype of Ba
// A >: B
class OtherStuff[-A]

// TODO need to fix this example

class Arg
class ProArg extends Arg
class FunProArg extends ProArg

trait Fun[-A, +R] {
  def magic(arg: A):R
}

class DoMagic extends Fun[ProArg, ProArg] {
  def magic(arg: ProArg): FunProArg = new FunProArg
}

class FastSpell extends Fun[ProArg, ProArg] {
  def magic(arg: ProArg): Arg = new Arg

class PowerfulSpell extends Fun[ProArg, ProArg] {
  def magic(arg: ProArg): FunProArg = new FunProArg