package ch02

import ch02.Ex06.product

object Ex07 extends App {

  /**
    * Solve the preceding exercise without writing a loop.
    */
  var product: Long = 1

  "Hello".map(_.toLong).foreach(product *= _)
  println(product)

  assert(product == 9415087488L)

}
