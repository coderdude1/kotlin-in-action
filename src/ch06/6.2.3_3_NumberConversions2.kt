package ch06.ex2_3_3_NumberConversions2

fun main(args: Array<String>) {
    println("42".toInt())

    //Any can store any type including null (if it is Any?)
    val blarg: Any = 42 //42 is autoboxed because Any is a reference type (same as Object in java)
//    val snorp: Any = null //compile error
    val snorp: Any? = null //valid
}
