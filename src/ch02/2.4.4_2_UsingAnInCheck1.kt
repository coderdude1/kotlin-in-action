package ch02.ex4_4_2_UsingAnInCheck1

//anything that implements comparable can be used in an in statement
fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "It's a digit!"
    in 'a'..'z', in 'A'..'Z' -> "It's a letter!" //note multiple ranges comma separated
    else -> "I don't know…​"
}

fun main(args: Array<String>) {
    println(recognize('8'))
}
