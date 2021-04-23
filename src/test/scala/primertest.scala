import org.scalatest.FunSuite

class primertest extends FunSuite {
  test ("primertest.d") {
    assert(primertest.div(3,100) === Vector(3, 6, 7, 9, 12, 14, 15, 18, 21))
  }
}
