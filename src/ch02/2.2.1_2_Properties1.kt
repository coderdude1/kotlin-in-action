package ch02

class Person(
    val name: String,   //Immutable
    var isMarried: Boolean //mutable
)

fun main(args: Array<String>) {
    val person = Person("john", true)
    println(person.name)
    println(person.isMarried)
    person.isMarried = false
//    person = Person("blargh", true)  //compile/edit time warning about val cannot be reassigned

//    person.name = 'blargh' //compile/edit time warning about val cannot be reassigned
}
