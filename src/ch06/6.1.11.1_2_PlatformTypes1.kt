package ch06.ex1_11_1_2_PlatformTypes1

import ch06.Person

/**
 * Mixing java/kotlin and nulls.
 *
 * In java if @Nullable String in java is String? in kotlin
 * in java @NotNull String is String in kotlin
 *
 * If no annotatoins are found then this becomes a 'Platform Type' in kotlin, this is a type
 * where kotlin does not have nullability info.  This means you need to manage nulls
 * as kotlin cannot do it.  There is more to it then this, ie dealing with java code
 * that may or may not be null.  I think generics makes this more 'interesting'
 *
 * Person is a java class
 */
fun yellAtSafe(person: Person) {
    println((person.name ?: "Anyone").toUpperCase() + "!!!") //required since Person is a platform type, we manage null checks like java
}

fun yellAtNotSafe(person: Person) {
    println((person.name))
}

fun main(args: Array<String>) {
    yellAtSafe(Person(null))
    yellAtNotSafe(Person(null)) //prints 'null'
}
