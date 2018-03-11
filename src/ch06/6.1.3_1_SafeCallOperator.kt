package ch06.ex1_3_1_SafeCallOperator

//s can be null ('?' means it)
fun printAllCaps(s: String?) {
    // ?. is safecall operator, if s is null no NPE
    //functionally same as if s != null then s.toUpperCase else null
    //only allows calls to the requested fn if it is not null
    val allCaps: String? = s?.toUpperCase()
    println(allCaps)
}

fun main(args: Array<String>) {
    printAllCaps("abc")
    printAllCaps(null)
}
