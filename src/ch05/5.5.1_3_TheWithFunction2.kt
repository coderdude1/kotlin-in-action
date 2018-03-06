package ch05.ex5_1_3_TheWithFunction2

//expression syntax with the 'with' assinged to 'alphabet()' as the receiver
//note this is a bit cleaner, less code than the previous with example
fun alphabet() = with(StringBuilder()) {
    for (letter in 'A'..'Z') {
        append(letter) //note no 'this'
    }
    append("\nNow I know the alphabet!")
    toString() //intellij prepends '$with' in front
}

fun main(args: Array<String>) {
    println(alphabet())
}
