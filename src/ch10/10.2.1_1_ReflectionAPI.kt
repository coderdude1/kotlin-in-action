package ch10.ex2_1_1_ReflectionAPI

//NOTE that this breaks with kotlin 1.2
import kotlin.reflect.memberProperties

class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val person = Person("Alice", 29)
    val kClass = person.javaClass.kotlin
    println(kClass.simpleName)
    kClass.memberProperties.forEach { println(it.name) }
}
