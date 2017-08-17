package strings

/*
in kotlin you can add methods to existing classes/objects rather than create Util classes with methods
 */
fun String.lastChar(): Char = this.get(this.length - 1)  //adds .lastChar fun to the String class

fun main(args: Array<String>) {
    println("Kotlin".lastChar())
}
