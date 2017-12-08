package ch05.ex1_5_2_MemberReferences1

data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val createPerson = ::Person //constructor reference
    val p = createPerson("Alice", 29)
    println(p)
}

//TODO research bound method/property references in kotlin 1.1/1.2