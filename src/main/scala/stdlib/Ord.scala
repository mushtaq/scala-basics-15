package stdlib

trait Ord[T] {
  def lt(a: T, b: T): Boolean
}

object Ord {
  implicit class Ex[T](x: T) {
    def <(other: T)(implicit ord: Ord[T]): Boolean = ord.lt(x, other)
  }

  implicit val intOrd: Ord[Int] = (a, b) => a < b

  implicit val intOrd2: Ord[Int] = (a: Int, b: Int) => a > b

  implicit val strOrd: Ord[String] = (a: String, b: String) => a < b

  implicit def optOrd[T: Ord]: Ord[Option[T]] =
    (a: Option[T], b: Option[T]) => (a, b) match {
      case (Some(x), Some(y)) => x < y
      case (None, _) => true
      case (_, None) => false
    }

}
