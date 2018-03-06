package ch05.Alphabet

fun alphabet(): String {
    val result = StringBuilder()
    for (letter in 'A'..'Z') {
         result.append(letter)
    }
    result.append("\nNow I know the alphabet!")
    return result.toString()
}

//Note these are the '*_TheWithFunction 1 and 2
fun lambdaAlphabet() : String {
    val stringBuilder = StringBuilder()
    //note with() takes an arg and a lambda (arg is accessible via this. or without it
    return with(stringBuilder) { //specify the receiver (stringBuilder) to get invoked in the 'with' block
        for (letter in 'A'..'Z') {
            this.append(letter) //calls a method on the reciever with the 'this'.  'this' appears optional in the block
        }
        append("\nNow I really know my alphabet") //calls receiver without 'this'
        toString() //another method on the reciever (can invoke this.toString also.  note intellij adds the ^with as a tip
    }
}

//note expression body syntax
fun alphabetWithAndAnExpressionBody() = with(StringBuilder()) {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know another way to do the alphabet")
    toString()
}

/**
 * Note if there is a function/method name in the outer class that has the same name as something
 * in the with receiver, you can use the following syntax to access the outer member
 *     this@OuterClass.toString()
 */
fun main(args: Array<String>) {
    println(alphabet())
    println(lambdaAlphabet())
    println(alphabetWithAndAnExpressionBody())
}
