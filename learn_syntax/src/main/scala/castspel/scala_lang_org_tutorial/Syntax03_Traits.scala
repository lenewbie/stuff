package castspel.scala_lang_org_tutorial

/**
 * Inspired by: http://docs.scala-lang.org/tutorials/tour/traits.html
 * @author lemastero
 */
object Syntax03_Traits {


}

trait Similarity {
  def isSimilar(x: Any): Boolean
  def isNOtSimilar(x: Any) :Boolean = !isSimilar(x)
}
