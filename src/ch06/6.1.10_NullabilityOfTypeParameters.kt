package ch06.ex1_10_NullabilityOfTypeParameters

//Generics are the only time '?' is default allowing nulls in kotlin
fun <T> printHashCodeNullable(t: T) { //T is inferred to be of type Any? (note '?' so null is valid)
    println(t?.hashCode())
}

fun <T: Any> printHashCodeNotNullable(t: T) {
    println(t?.hashCode())
}

fun main(args: Array<String>) {
    printHashCodeNullable(null) //prints null as T is inferred from Any? note the '?'
    //printHashCodeNotNullable(null) //compile error inferred type Nothing is not subtype of Any
}
