package ch05.ex2_1_2_FilterMap1

data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 29), Person("Bob", 31),
            Person("One", 32), Person("Two", 32), Person("Three", 22))
    println(people.filter { it.age > 30 })
    println(people.filter { it.age > 30 }.map { it.name }) //filter then map to list of strings (names)
    println(people.filter { it.age > 30 }.map (Person::name))//same as it.name

    //bad example of getting the names of the oldest people in the group. note the inner people.maxBy
    //it will be performed for each person in the people list so very expensive for large lists of people
    println(people.filter { it.age == people.maxBy(Person::age)?.age })

    //could extract the inner maxBy as a seperate operation then use that as part of the filter
    val maxAge = people.maxBy(Person::age)?.age
    println(people.filter { it.age == maxAge })
}
