package ch02

object Ex05 extends App {

  /**
    * Write a procedure countdown(n: Int) that prints the numbers from n to 0.
    */
  def countdown(n: Int) {
    (1 to n reverse).foreach(println)
  }

  countdown(20)
}
