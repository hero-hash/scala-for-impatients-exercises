package ch01

import Math._

import scala.util.Random
import BigInt._

object Chapter1 extends App {
  val sqrtSquare = pow(sqrt(3), 2)
  println(sqrtSquare)

  val tripleCrazy = "crazy" * 3
  println(tripleCrazy)

  val maxValue = 10 max 2
  println(maxValue)

  val bigIntValue = 2.pow(10)
  println(bigIntValue)

  val prime = probablePrime(2, Random)
  println(prime)

  val randomString = probablePrime(10, Random).toString(36)
  println(randomString)

  val str = "Scala string"
  println(str)
  println(str(0))
  println(str.take(3))
  println(str.drop(3))
  println(str.takeRight(3))
  println(str.dropRight(3))
  println(str.substring(0, 3))

}
