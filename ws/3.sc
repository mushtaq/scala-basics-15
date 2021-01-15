
val xs = List(1, 2, 3, 4)
val ys = List("a", "b", "c", "d")

xs.filter(_ > 3)

(1, "abc")
(1, "abc", 6.7)

val tuples = xs.zip(ys)

tuples.toMap

val m = Map(1 -> "aaaaa", 2 -> "bb")

m(1)
m.apply(1)

m.view.mapValues(s => s.length).toMap

m.map { case (k, v) =>
  k -> v.length
}

m.values.toSet

val set = Set(1, 2, 2, 4, 1)

set.contains(1)
