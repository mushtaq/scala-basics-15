import app.{Book, Data}
import googlelib.Sorter
import stdlib.Ord

{
  implicit val intOrd2: Ord[Int] = new Ord[Int] {
    override def lt(a: Int, b: Int): Boolean = a > b
  }

  Sorter.iSort(List(2, 4, 1, 8))
}

import Ord.intOrd

Sorter.iSort(List(2, 4, 1, 8))


Sorter.iSort(List("z", "a", "c"))
Sorter.iSort(List(Some(8), None, Some(2)))
Sorter.iSort(List(Some("z"), None, Some("a")))
Sorter.iSort(Data.books).foreach(println)
Sorter.iSort(Data.books2).foreach(println)
