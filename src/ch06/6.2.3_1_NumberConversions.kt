package ch06.ex2_3_1_NumberConversions

fun main(args: Array<String>) {
    val x = 1
    val listOfInts = listOf(1, 2, 3)//kotlin used Boxed type Integer, even tho it is not nullable
    println(x.toLong() in listOf(1L, 2L, 3L)) //toLong is required, kotlin won't autoconvert to long

    //If you need to store lots of primitives, use a 3rd party lib to store these
}
