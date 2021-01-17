case class Person(name: String, age: Int) {
  def withAge(newAge: Int) = new Person(name, newAge)
}

val p = new Person("mahesh", 33)
val p2 = new Person("mahesh", 33)

val p4 = p.copy(age = 88)
p4.age
p4.name
p == p4
p eq p4

// creates class
  // get name/age
  // equality, hashcode
  // nice toString
  // increase age
  // Map[Person, Company] ==> Map(p -> c1)
  // map(p) ===> c1
  // map(p2) ===> error

// creates companion object
  // adds apply methods


p.name
p.age

100 == 100

p.equals(p2)
p == p2 // same as above

p eq p2

p.hashCode()
p2.hashCode()

val p3 = p.withAge(11)
p3.age
p3.hashCode()
p == p3
p eq p3
