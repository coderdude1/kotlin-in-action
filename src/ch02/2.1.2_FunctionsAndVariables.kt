package ch02

fun max(a: Int, b: Int): Int {
    val answer : Int //this is how you declare something without a value, has to be in a function scope
//    answer = "bl"  //type mismatch int vs string
    answer = 42 //note intellij warns that this can be combined with declartion
    println("answer :$answer")
    return if (a > b) a else b
}

fun varsAndVals() {
    val message: String
//    if()
}

//can also declare it as an expression body like this
//intellij allows you to click in it (the name othermax) and it will popuup an intention (lightbulb)
//that will offer the option to convert between expresion body and block body.  Feels sorta kinda like a lambda
fun otherMax(a: Int, b: Int): Int = if(a > b) a else b

fun testImmutability(a: Int): Int {
    println("Input: $a")
//    a = a*a  //compile time warning 'val cannot be reassigned'
    return a
}

val question = "blargh glargh snark" //single quotes are for single chars
//val question = 42 //causes conflicting declarations since it's defined 2 times as different types

fun main(args: Array<String>) {
    println(max(1, 2))
}
