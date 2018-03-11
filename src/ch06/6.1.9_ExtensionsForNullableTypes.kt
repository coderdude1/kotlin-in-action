package ch06.ex1_9_ExtensionsForNullableTypes

//note String input is nullable
fun verifyUserInput(input: String?) {
    //note no safe call on receiver, even tho it is nullable, extensions manage that for us
    if (input.isNullOrBlank()) {
        println("Please fill in the required fields")
    }
}

fun main(args: Array<String>) {
    verifyUserInput(" ")
    verifyUserInput(null)
}
