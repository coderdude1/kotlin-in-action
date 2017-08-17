package ch03.JoinToString

fun <T> joinToString(
        collection: Collection<T>,
        separator: String,
        prefix: String,
        postfix: String
): String {

    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) { //index is the same as the i=0; i<x; i++;  element is the element at that index
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)
    println(joinToString(list, "; ", "(", ")"))  //(1; 2; 3)

    val listOfStrings = listOf("works", "on", "ALL", "TYPES")
    println(joinToString(listOfStrings, "; ", "(", ")"))  //((works; on; ALL; TYPES)
}
