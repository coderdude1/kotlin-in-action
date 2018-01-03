package ch05.ex2_3_1_GroupBy

data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 31),
            Person("Bob", 29), Person("Carol", 31))
    //simlar to java partitionBy, behaves like a multimap, in this case returns a map keyed by age,
    // with a list of People that matches the predicate
    println(people.groupBy { it.age })
}
