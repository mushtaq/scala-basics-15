import scala.collection.mutable

val xs = List(1, 2, 3, 4)

val xs2 = xs.prepended(0)

xs

////////


val xs = mutable.Buffer(1, 2, 3, 4)

xs.insert(0, 99)

xs
