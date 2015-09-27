package org.castspel.unionFind

import org.scalatest.FunSuite

import scala.io.Source


class BuildFromFileSpec extends FunSuite {

  test("Should create UnionFind from proper file") {
    val source = Source.fromURL(getClass.getResource("/tinyUF.txt"))
    val lines = try source.mkString finally source.close()

    assert(true)
  }

}
