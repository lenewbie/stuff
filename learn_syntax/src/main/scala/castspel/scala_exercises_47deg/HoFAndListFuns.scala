package castspel.scala_exercises_47deg

/**
 * http://scala-exercises.47deg.com/koans#higherorderfunctions
 */
object HoFAndListFuns extends App {
  def doWhatYouLike(xs: List[String], whatYouLike: String => String) = {
    xs map whatYouLike
  }

  def upper(arg: String) : String = arg.toUpperCase

  val sentence =  List("Ala", "ma", "KOTA" )
  println( doWhatYouLike(sentence, upper).toString  )
  println( List("Scala", "Erlang", "Scheme") map (_.length) )
  List(main _, doWhatYouLike _, upper _ ) map (println _)
}
