package strings

/**
 * this will compile to join.class
 *
 * java classes can import strings.JoinKT andthe joinToStrings will be a static method in it.
 *
 * you can change the name of the class file by using the @file:JvmName("StringFunctions")
 */
fun <T> joinToStrings(collection: Collection<T>,
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

