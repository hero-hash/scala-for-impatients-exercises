package ch02

object Ex01 extends App {

  /**
    * The signum of a number is 1 if the number is positive, –1 if it is negative, and
    * 0 if it is zero. Write a function that computes this value.
    */
  def signum(number: Int) = {
    if (number < 0) -1 else if (number > 0) 1 else 0
  }

  assert(signum(25) == 1)
  assert(signum(-25) == -1)
  assert(signum(0) == 0)
}
