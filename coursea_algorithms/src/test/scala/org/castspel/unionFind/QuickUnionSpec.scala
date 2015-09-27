package org.castspel.unionFind

import org.scalatest.FunSuite


class QuickUnionSpec extends FunSuite{

  test("QuickUnion create not connected elements") {
    val noComponents = QuickUnion(4)
    assert( ! noComponents.connected(1, 2) )
    assert( ! noComponents.connected(2, 1) )
  }

  test("Empty QuickUnion have 0 components") {
    val noComponents = QuickUnion(0)
    assert( noComponents.count() == 0 )
  }

  test("QuickUnion created have number of components equal number of elements") {
    val noComponents = QuickUnion(3)
    assert( noComponents.count() == 3 )
  }

  test("QuickUnion check union first and second") {
    val uf = QuickUnion(10)

    uf.union(5, 2)

    assert(uf.connected(5 , 2))
    assert(uf.connected(2 , 5))
  }

  test("QuickUnion check union first and second when second already connected") {
    val uf = QuickUnion(10)

    uf.union(4, 3)
    uf.union(3, 8)

    assert(uf.connected(4 , 3))
    assert(uf.connected(3 , 8))

    assert(uf.connected(4 , 8))
  }

  test("QuickUnion check union scenarion 4") {
    val uf = QuickUnion(10)

    uf.union(4, 3)
    uf.union(3, 8)
    uf.union(6, 5)
    uf.union(9, 4)
    uf.union(2, 1)

    assert(uf.connected(4, 3))
    assert(uf.connected(3, 8))
    assert(uf.connected(6, 5))
    assert(uf.connected(9, 4))
    assert(uf.connected(9, 3))
    assert(uf.connected(9, 8))
    assert(uf.connected(2, 1))

    assert(! uf.connected(5, 0))
  }

}
