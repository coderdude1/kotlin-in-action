package ch02.ex3_2_1_WhenEnums

enum class Color {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

//returns the mnemonic for the given color
fun getMnemonic(color: Color) =
    when (color) {          //note no breaks, they are implicit.  colors can be combined using commas
        Color.RED -> "Richard"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
        Color.GREEN -> "Gave"
        Color.BLUE -> "Battle"
        Color.INDIGO -> "In"
        Color.VIOLET -> "Vain"
    }

fun main(args: Array<String>) {
    println(getMnemonic(Color.BLUE))
}
