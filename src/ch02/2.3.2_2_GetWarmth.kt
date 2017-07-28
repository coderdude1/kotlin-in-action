package ch02.GetWarmth

enum class Color {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

fun getWarmth(color: Color) =
        when (color) {  //examploe of combining colors with same result since we don't have breaks;
            Color.RED, Color.ORANGE, Color.YELLOW -> "warm"
            Color.GREEN -> "neutral"
            Color.BLUE, Color.INDIGO, Color.VIOLET -> "cold"
        }

fun main(args: Array<String>) {
    println(getWarmth(Color.ORANGE))
}
