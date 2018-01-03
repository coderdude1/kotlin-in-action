package ch05.ex2_2_3_AllAnyCountFind2

data class Person(val name: String, val age: Int)

val canBeInClub27 = { p: Person -> p.age <= 27 }

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 27), Person("Bob", 31),
            Person("snarp", 21), Person("oldSnarp", 63))
    /*
    find appears to find the first instance that meets the predicate, or null if not found
    there is a 'firstOrNull' that is similar but more clear in the name
     */
    println(people.find(canBeInClub27)) //Person(name=Alice, age=27)
    println(people.findLast(canBeInClub27)) //Person(name=snarp, age=21)
}
