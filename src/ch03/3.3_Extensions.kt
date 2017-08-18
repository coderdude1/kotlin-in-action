package strings

/*
in kotlin you can add methods to existing classes/objects rather than create Util classes with methods

 */
//I think this is a top level prppert that becomes a maybe a static and can be accessed from java via imlicit
// getter/setter since var (not val)
var someProperty = "blargh"

fun String.lastChar(): Char = this.get(this.length - 1)  //adds .lastChar fun to the String class

fun main(args: Array<String>) {
    println("Kotlin".lastChar())
}
