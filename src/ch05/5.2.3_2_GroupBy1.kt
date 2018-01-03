package ch05.ex2_3_2_GroupBy1

fun main(args: Array<String>) {
    val list = listOf("a", "ab", "b")
    /*
    first is an extension method on String but can be used as a member reference
    result is map with the first letter as the key, the value is a list that has that letter as first
     */
    println(list.groupBy(String::first))
}
