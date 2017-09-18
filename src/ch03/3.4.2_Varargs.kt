package ch03.ex4_2_Varargs

fun main(args: Array<String>) {
    val list = listOf("args: ", *args) //* is spreadOperator, unpacks the list of args
    println(list)

    //the word 'to' is a fn invocation called an infix call to create a map
    // an infix call is a seperator between the parameter and the target object
    //you can create an infix fn by adding the keyword infix to it
    //https://kotlinlang.org/docs/reference/functions.html (search for infix)
    //note it returns a Pair (in this case a key/value of a map?)
    val mapOfStuff = mapOf(1 to "one", 7 to "seven", 53 to "fifty-three")
    println(mapOfStuff)

    //destructuring declaration, init two vars with a pair (of infix)
    val (number, name) = 1 to "one"
    println(number)
    println(name)

    //ex
//    for ((index, element) in collection.withIndex()) {     println("$index: $element") }
}
