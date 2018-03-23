package ch06.ex2_3_2_NumberConversions1

fun foo(l: Long) = println(l)

fun main(args: Array<String>) {
    val b: Byte = 1//specify type for b
    val l = b + 1L // + works with byte and longs, l becomes a long
    foo(42)
}
