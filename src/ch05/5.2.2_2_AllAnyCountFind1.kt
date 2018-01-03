package ch05.ex2_2_2_AllAnyCountFind1

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)
    println(!list.all { it == 3 })//while the not is valid it is a bit less readable, use the any (next line)
    println(list.any { it != 3 }) //same result a bit more readable for intent


}
