

def insert(x: Int, sortedList: List[Int]): List[Int] =
  sortedList match {
    case Nil                   => List(x)
    case head :: _ if x < head => x :: sortedList
    case head :: tail          => head :: insert(x, tail)
  }

def iSort(xs: List[Int]): List[Int] =
  xs match {
    case Nil          => Nil
    case head :: tail => insert(head, iSort(tail))
  }

val xs = List(9, 3, 1, 45, 23)

iSort(xs)
