package castspel.patterns.typeclassopedia

/**
 * Scala Typeclassopedia, John Kodumal
 * https://www.youtube.com/watch?v=IMGCDph1fNY
 */

object Stuff {

  // definition of typeclass
  // - set of behaviors that we want implement (by given class)
  trait Show[A] {
    def shows(a: A):String
  }

  // witness
  // - instance of type class for particular class
  // - given type belongs to that type class
  // anonymous class
  implicit val IntShow = new Show[Int] {
    def shows(a: Int) = a.toString
  }

  // way to call that method
  // via implicit
  def shows[A](a: A)(implicit shower: Show[A]) = shower.shows(a)
  // alternative using context bounds
  // def shows2[A: Show]((a: A) = implicitly[Show[A]].shows(a)
  // def implicitly[A](implicit a: A) = a

  // in scalaz they pimp common typeclasses
  //3.shows // have Show[Int] in scope

}
