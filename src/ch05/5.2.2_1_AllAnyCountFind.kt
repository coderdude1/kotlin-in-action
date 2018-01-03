package ch05.ex2_2_1_AllAnyCountFind

//note that this is the one in scope even tho it is defined in several other 'class' files (java
//termish)

data class Person(val name: String, val age: Int)

val canBeInClub27 = { p: Person -> p.age <= 27 }

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 27), Person("Bob", 31))
    println(people.all(canBeInClub27)) //all accepts a predicate, all entries need to satisfy it for it to return true
    println(people.any(canBeInClub27)) //any accepts a predicate, 1 or more entries need to satisfy it

    //count will show how many elements match the predicate
    //count is more efficient than filtering a collection then using size(), no intermediate collection involved, just the count
    println(people.count(canBeInClub27))
}
