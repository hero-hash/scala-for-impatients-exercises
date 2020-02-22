package ch02

object Ex02 extends App{

  /**
    * What is the value of an empty block expression {}? What is its type?
    */
  val expresion = {}

  assert (expresion.isInstanceOf[Unit])
}
