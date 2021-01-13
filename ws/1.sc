
class B(a: Int) {
  def square(x: Int): Int = x * x
}

val b = new B(10)
val b1 = new B(11)
object b extends B(10)
object b1 extends B(11)

b.square(9)


object A {
  def factory(a: Int): B = new B(a)
  def square(x: Int): Int = x * x
  val square2: Int => Int = x => x * x
}

A.square(9)

val xs = List(1, 2, 3, 4)
xs.map(x => x * x)
xs.map(A.square)
xs.map(A.square2)
xs.map(b.square)

val f = b.square _
val f: Int => Int = b.square _
val f: Int => Int = b.square // eta expansion
val f: Int => Int = new Function[Int, Int] {
  override def apply(v1: Int) = b.square(v1)
}
