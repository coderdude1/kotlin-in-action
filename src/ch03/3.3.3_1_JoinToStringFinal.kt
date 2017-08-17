package ch03.JoinToStringFinal

fun <T> Collection<T>.joinToString(
        separator: String = ", ",   //note the default values for the named params
        prefix: String = "",
        postfix: String = ""
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)
    //note the name of the param, it is optional.  intellij rename refactor will keep these current.  makes it easier to know what you are setting
    //can't do this on java calls, only kotlin
    println(list.joinToString(separator = "; ",
          prefix = "(", postfix = ")"))

    val listOfStrings = listOf("works", "on", "ALL", "TYPES")
    println(listOfStrings.joinToString("; ", "(", ")"))  //((works; on; ALL; TYPES)

    //note default values means we don't have to use all the params, easy way to not have a bunch of different constructors
    println(listOfStrings.joinToString(prefix = "*"))
}
