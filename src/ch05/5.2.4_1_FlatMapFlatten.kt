package ch05.ex2_4_1_FlatMapFlatten

fun main(args: Array<String>) {
    val strings = listOf("abc", "def")

    /*
    From the book p112:
    "The flatMap function does two things: At first it transforms (or maps ) each element to a
    collection according to the function given as an argument, and then it combines (or flattens )
    several lists into one."

    flatmapit.toList maps "abc" and "def" strings to a list for each one
        ["a", "b", "c"] and ["d", "e", "f"].
    flatMap then flattens it to ["a', "b", "c", "d", "e", "f"]
     */
    println(strings.flatMap { it.toList() })
}
