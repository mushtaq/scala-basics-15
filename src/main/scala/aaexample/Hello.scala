package aaexample

object Hello extends Greeting with App {
  println(greeting)

  val m = Map(1 -> "a1234", 2 -> "b")

  val maybeString = m.get(1)
  val maybeString2 = m.get(2)
  m.get(22)
  m.get(322)

  Some("abc")

  maybeString match {
    case None => println("")
  }

}

trait Greeting {
  lazy val greeting: String = "hello"
}
