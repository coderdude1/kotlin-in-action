package ch02.ex3_2_3_WhenEnums2

import ch02.colors.Color        //imports color class (required for Color)
import ch02.colors.Color.*  //import the constants (like a static import)

//same function that was in getWarmth.kt,  shows importing of enum Constants
fun getWarmth(color: Color) = when(color) {
    RED, ORANGE, YELLOW -> "warm"
    GREEN -> "neutral"
    BLUE, INDIGO, VIOLET -> "cold"
}

fun main(args: Array<String>) {
    println(getWarmth(Color.ORANGE))
}
