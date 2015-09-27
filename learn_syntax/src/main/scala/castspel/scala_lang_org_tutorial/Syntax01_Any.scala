package castspel.scala_lang_org_tutorial

import scala.collection.mutable

/**
 * Inspired by: http://docs.scala-lang.org/tutorials/tour/unified-types.html
 * @author lemastero
 */
object Syntax01_Any {

   def main(args: Array[String]): Unit = {

     val set = new mutable.LinkedHashSet[Any]
     set += "This is string"
     set += 42
     set += 'c'
     set += true
     set += main _ // WTF is _

     val iterator: Iterator[Any] = set.iterator
     while (iterator.hasNext)
       println( iterator.next.toString )

   }

 }
