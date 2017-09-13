package ch03.ex3_5_ExtensionProperties

val String.lastChar: Char   //note val (property) with a receiver type of String added.  returns Char
    get() = get(length - 1)  //always required to define a getter since this is an extension property (really no backing field), no setter since 'val'
var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {  //setter since this is declaredd VAR (and a stringbuilder is mutable)
        this.setCharAt(length - 1, value)
    }

fun main(args: Array<String>) {
    println("Kotlin".lastChar)  //String.lastChar, returns 'n'
    val sb = StringBuilder("Kotlin?")
    sb.lastChar = '!'   //set lastChar of stringbuilder to '!'
    println(sb)
}
/*
extension properties appear to be extension functions defined in a way to use the property syntax vs fn syntax
note it isn't possible to actually use extensions to add fields to an existing instances of existing java classes.
  extension properties appear to be a shortcut to extension functions
 */