package ch03.ex5_1_2_SplittingStrings1

fun main(args: Array<String>) {
    println("12.345-6.A".split(".", "-"))//kotlin style split notice no regex due to kotlin overload on split
}
