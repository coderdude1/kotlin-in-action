package ch06.ex1_4_1_ElvisOperator

//takes a nullable string s, returns an Int
//returns s.length if s is not null, else 0
fun strLenSafe(s: String?): Int = s?.length ?: 0 // ?: is elvis operator if s is null, return 0

fun main(args: Array<String>) {
    println(strLenSafe("abc"))
    println(strLenSafe(null))
}
