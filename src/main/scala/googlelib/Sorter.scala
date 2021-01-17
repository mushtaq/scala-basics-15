package googlelib

import stdlib.Ord
import Ord.Ex

object Sorter {
  def insert[T: Ord](x: T, sortedList: List[T]): List[T] =
    sortedList match {
      case Nil                   => List(x)
      case head :: _ if x < head => x :: sortedList
      case head :: tail          => head :: insert(x, tail)
    }

  def iSort[T: Ord](xs: List[T]): List[T] =
    xs match {
      case Nil          => Nil
      case head :: tail => insert(head, iSort(tail))
    }
}
