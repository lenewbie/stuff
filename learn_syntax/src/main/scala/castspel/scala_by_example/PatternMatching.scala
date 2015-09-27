package castspel.scala_by_example

object PatternMatching {

  def is42(x: Int): String =
    x match {
      case 42 => s"yes $x is 42!"
      case _ => s"no $x is something else"
    }

  def add(a1: Int, a2: Int, a3: Int) = a1 + a2 + a3

  def whatTypeOfFunction(fun: Any) =
   fun match {
     case fun: Function1[_, _] => "doing side effects like a boss?"
     case fun: Function2[_, _, _] => "cool 1 argument"
     case fun: Function3[_, _, _, _] => "2 args - you are pushing it"
     case _ => "evil madness! refactor it!"
   }

  def main(args: Array[String]): Unit = {
    println( is42(42) )
    println( whatTypeOfFunction( is42 _) )
    println( whatTypeOfFunction( add _ ))
  }

}
