package ch02

object Ex03 extends App {

  /**
    * Come up with one situation where the assignment x = y = 1 is valid in Scala.
    */
  var y: Int = 0
  val x: Unit = y = 1

  assert(x.isInstanceOf[Unit])
  assert(y.isInstanceOf[Int])
}
