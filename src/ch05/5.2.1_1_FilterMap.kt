package ch05.ex2_1_1_FilterMap

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4)
    println(list.filter { it % 2 == 0 }) //predicate arg to filter, each item gets it applied
}
