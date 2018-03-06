package ch05.ex5_2_1_TheApplyFunction

//intellij appends a 'this: StringBuilder' to following line
//note expresion syntax.  apply is similar to with, but it returns the receiver object
//(ie the arg passed in)
fun alphabet() = StringBuilder().apply {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
}.toString() //note toString is outside lambda as it returns the receiver (stringBuilder)

fun main(args: Array<String>) {
    println(alphabet())
}
