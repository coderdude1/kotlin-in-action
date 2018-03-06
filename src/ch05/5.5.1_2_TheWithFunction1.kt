package ch05.ex5_1_2_TheWithFunction1

fun alphabet(): String {
    val stringBuilder = StringBuilder()
    //intellij appens this: Stringbuilder after the next line.
    // with takes a function called the receiver ('stringBuilder') which can be referenced via 'this'
    return with(stringBuilder) {
        for (letter in 'A'..'Z') {
            this.append(letter) //this refernces the art to with().  intellij hints that
        }
        append("\nNow I know the alphabet!")
        this.toString() //note that intellij prepends ^with to indicate what up
    }
}

fun main(args: Array<String>) {
    println(alphabet())
}
