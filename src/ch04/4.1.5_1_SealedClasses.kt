package ch04.ex1_5_1_SealedClasses

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int =
    when (e) {
        is Num -> e.value
        is Sum -> eval(e.right) + eval(e.left)
        else ->  //default branch since we have when statement only  required by compiler
            throw IllegalArgumentException("Unknown expression")
        //problem with thsi is it's cumbersome and a subclass might have issues with adding a new branch leading to bugs
    }

fun main(args: Array<String>) {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
}
