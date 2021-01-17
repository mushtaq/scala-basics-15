
val xs = List(1, 2, 3, 4)

var state = 0

val square: Int => Int = x => x * x + state

val square: Function1[Int, Int] = x => x * x

val square: Function1[Int, Int] = { x =>
  x * x
}

val square4: Function1[Int, Int] = new Function[Int, Int] {
  override def apply(v1: Int) = v1 * v1
}

xs.map(square4)
xs.map(x => x * x)

xs.map(new Function1[Int, Int] {
  override def apply(v1: Int) = v1 * v1
})

xs.foldLeft(0)((acc, elm) => acc + elm)
xs.foldLeft(0)(new Function2[Int, Int, Int] {
  override def apply(v1: Int, v2: Int) = v1 + v2
})
