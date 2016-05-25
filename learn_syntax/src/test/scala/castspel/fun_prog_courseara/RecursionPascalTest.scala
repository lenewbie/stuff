package castspel.fun_prog_courseara

import org.scalatest.FunSuite


class RecursionPascalTest extends FunSuite {

  import castspel.fun_prog_courseara.Recursion._

  test("pascal: col=0,row=2") {
    assert(pascal(0,2) === 1)
  }

  test("pascal: col=1,row=2") {
    assert(pascal(1,2) === 2)
  }

  test("pascal: col=1,row=3") {
    assert(pascal(1,3) === 3)
  }

}
