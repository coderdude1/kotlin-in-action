package ch02.ex3_5_SmartCasts

interface Expr //define an interface
//the : Expr means the class implements the interface Expr
class Num(val value: Int) : Expr //class takes a val Int, implements Expr interface
class Sum(val left: Expr, val right: Expr) : Expr //class takes 2 val Expr, implements Expr

//java style kotlin
fun eval(e: Expr): Int {
    if (e is Num) { //same as instanceof
        val n = e as Num //as Num  cast is not necessary, intellij warns on it
        return n.value
    }
    if (e is Sum) {
        return eval(e.right) + eval(e.left)
    }
    throw IllegalArgumentException("Unknown expression")
}

fun main(args: Array<String>) {
    //a tree of sums and numbers, gets evald top down
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
}
