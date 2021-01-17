import scala.annotation.tailrec

val xs = List(1, 2, 3, 4)
val xs = 1 :: 2 :: 3 :: 4 :: Nil

def length[T](xs: List[T]): Int =
  xs match {
    case Nil         => 0
    case ::(_, next) => 1 + length(next)
  }

//length((1 to 10000).toList)

def length2[T](xs: List[T]): Int = {
  @tailrec
  def inner(xs: List[T], result: Int): Int =
    xs match {
      case Nil            => result
      case ::(head, next) => inner(next, 1 + result)
    }
  inner(xs, 0)
}

length2((1 to 10000).toList)

@tailrec
def contains[T](x: T, xs: List[T]): Boolean =
  xs match {
    case Nil          => false
    case head :: next => if (head == x) true else contains(x, next)
  }

@tailrec
def contains2[T](x: T, xs: List[T]): Boolean =
  xs match {
    case Nil       => false
    case `x` :: _  => true
    case _ :: next => contains2(x, next)
  }

contains(2, xs)
contains(22, xs)

