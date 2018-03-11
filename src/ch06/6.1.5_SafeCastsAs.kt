package ch06.ex1_5_SafeCastsAs

class Person(val firstName: String, val lastName: String) {
    //the Any? accepts any type, even null
   override fun equals(o: Any?): Boolean {

        //o as? Person returns o if it is a person, otherwise returns null
        //elvis, if o is a person set otherPerson to o, otherwise return false
      val otherPerson = o as? Person ?: return false

      return otherPerson.firstName == firstName &&
             otherPerson.lastName == lastName
   }

   override fun hashCode(): Int =
      firstName.hashCode() * 37 + lastName.hashCode()
}

fun main(args: Array<String>) {
    val p1 = Person("Dmitry", "Jemerov")
    val p2 = Person("Dmitry", "Jemerov")
    println(p1 == p2)
    println(p1.equals(42))
}
