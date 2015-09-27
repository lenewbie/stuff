package org.castspel.unionFind

import scala.io.Source


object BuildFromFile {

  def build(source: Source): QuickFind = {
    val lines = try source.getLines().toList finally source.close()

    val length :: pairs = lines
    val result = new QuickFind( length toInt )

    def parseConnection(line:String) = {
      val pair = line split " "
      result connected( pair(1) toInt,  pair(1) toInt)
    }
    pairs foreach parseConnection

    result
  }

  def main(args: Array[String]) = {
    val source = Source.fromURL(getClass.getResource("/tinyUF.txt"))
    val union = build(source)
  }
}
