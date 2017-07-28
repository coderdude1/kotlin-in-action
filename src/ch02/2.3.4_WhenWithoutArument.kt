package ch02.ex3_4_WhenWithoutArument

import ch02.colors.Color
import ch02.colors.Color.*

fun mixOptimized(c1: Color, c2: Color) =
    when {  //note no arg to when, therefore this is a Boolean expression.  more verbose in this case than the setOf
        (c1 == RED && c2 == YELLOW) ||
        (c1 == YELLOW && c2 == RED) ->
            ORANGE

        (c1 == YELLOW && c2 == BLUE) ||
        (c1 == BLUE && c2 == YELLOW) ->
            GREEN

        (c1 == BLUE && c2 == VIOLET) ||
        (c1 == VIOLET && c2 == BLUE) ->
            INDIGO

        else -> throw Exception("Dirty color")
    }

fun main(args: Array<String>) {
    println(mixOptimized(BLUE, YELLOW))
}
