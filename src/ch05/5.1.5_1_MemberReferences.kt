package ch05.ex1_5_1_MemberReferences

fun salute() = println("Salute!") //salute is a function reference

fun main(args: Array<String>) {
    run(::salute)   //method reference to salute
}
