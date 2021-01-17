case class Person(name: String, age: Int)

object Person {
  def fromName(name: String) = new Person(name, 88)
}

val p = Person("mahesh", 33)
val p = Person.fromName("mahesh")

//val p = Person.apply("mahesh", 33)
