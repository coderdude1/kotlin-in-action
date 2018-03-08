package ch06.ex1_1_NullableTypes

//s cannot be null or a compile time error will happen
fun strLenNoNulls(s: String): Int =
        s.length

//fun strLenSafeIncorrectlyWritten(s: String?): Int =
//        s.length  //nulls are allowed as args but this is not null safe warning

//? means nulls are allowed, but the fn must be null safe
fun strLenSafe(s: String?): Int =
    if (s != null) s.length else 0 //if s not null return length else 0

val x: String? = null
//var y: String = x //type mismatch expected String got String?

fun main(args: Array<String>) {
    val x: String? = null   //x is nullable (note val not var) and is null
    //x = 3  //compile time warning val cannot be reassigned
    println(strLenSafe(x))
    println(strLenSafe("abc"))

//    println(strLenNoNulls(x))//compile error Required: String; Found: String?
//    println(strLenNoNulls(null)) //null cannot be a value of non-null type String
}
