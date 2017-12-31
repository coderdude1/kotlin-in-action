package ch05.ex2_1_5_FilterMap4

fun main(args: Array<String>) {
    /*
    https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/map-of.html
    mapOf takes a vararg set of Pairs, ie 'key' to 'value'
     */
    val numbers = mapOf(0 to "zero", 1 to "one") //I think to makes it pairs (intelij hint)
    println(numbers.mapValues { it.value.toUpperCase() })
}
