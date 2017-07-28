package ch02.ex3_3_UsingWhenWithArbitraryObjects

import ch02.colors.Color
import ch02.colors.Color.*

//note that this creates several sets when everytime it is called.  If called a lot
//this is expensive.  There are a couple of ways to deal with this, one of which is
//in 2-3-3_UsingWhenWithoutArgument.kt
fun mix(c1: Color, c2: Color) =
        when (setOf(c1, c2)) {
            setOf(RED, YELLOW) -> ORANGE  //setOf is part of kotlin.collections
            setOf(YELLOW, BLUE) -> GREEN
            setOf(BLUE, VIOLET) -> INDIGO
            else -> throw Exception("Dirty color")
        }

fun main(args: Array<String>) {
    println(mix(BLUE, YELLOW))
    println(mix(YELLOW, BLUE))//order doesn't matter both return green
}
