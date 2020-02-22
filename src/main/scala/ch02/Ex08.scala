package ch02

import ch02.Ex07.product

object Ex08 extends App {

  /**
    * Write a function product(s : String) that computes the product, as described
    * in the preceding exercises
    */
  def product(s: String) = {

    var product: Long = 1
    s.map(_.toLong).foreach(product *= _)
    product
  }

  println(product("Hello"))

  assert(product("Hello") == 9415087488L)

}
