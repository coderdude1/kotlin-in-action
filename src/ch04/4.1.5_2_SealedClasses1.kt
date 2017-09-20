package ch04.ex1_5_2_SealedClasses1

sealed class Expr {  // sealed class.  other classes/files cannot extend this, and subclasses have to be declared within the sealed class
    class Num(val value: Int) : Expr() //constructor declares class props as val (immutable) and type int
    class Sum(val left: Expr, val right: Expr) : Expr()  //subclasses have to be done here.  note the :Expr() not sure yet
}

fun eval(e: Expr): Int =
    when (e) {
        is Expr.Num -> e.value
        is Expr.Sum -> eval(e.right) + eval(e.left)//note no else/default branch since it can only be a num/sum
    }

fun main(args: Array<String>) {
    println(eval(Expr.Sum(Expr.Sum(Expr.Num(1), Expr.Num(2)), Expr.Num(4))))
}
