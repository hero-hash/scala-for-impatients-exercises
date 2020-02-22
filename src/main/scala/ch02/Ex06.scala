package ch02

object Ex06 extends App {
  /**
    * Write a for loop for computing the product of the Unicode codes of all letters
    * in a string. For example, the product of the characters in "Hello" is 9415087488L.
    */
  var product:Long = 1
  for (ch <- "Hello") product *= ch
  println(product)

}
