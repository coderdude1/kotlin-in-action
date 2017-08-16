package ch03.ex1_1_CreatingCollectionsInKotlin

val set = hashSetOf(1, 7, 53) //some kotlin convience methods note no static import kotlin collections
val list = arrayListOf(1, 7, 53)
val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

fun main(args: Array<String>) {
    println(set.javaClass) //same as set.getClass() in java, prints java.util.HashSet
    println(list.javaClass)
    println(map.javaClass)

    println(set)
    println(list)
    println(map)
}
/*
kotlin does not define it's own collections it uses the standard java collections
 although kotlin adds some nice stuff like the last, max etc, etc.  more in the next example
look in the 3.1_2 for examples
 */