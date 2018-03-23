package ch06.ex2_2_NullablePrimitiveTypes

data class Person(val name: String,
                  val age: Int? = null) { //name required, age nullable

    //other not nullable, returns nullable Boolean, note kotlin uses java Boolean since its nullable
    fun isOlderThan(other: Person): Boolean? {
        if (age == null || other.age == null)
            return null
        return age > other.age
    }
}

fun main(args: Array<String>) {
    println(Person("Sam", 35).isOlderThan(Person("Amy", 42)))
    println(Person("Sam", 35).isOlderThan(Person("Jane")))
}
