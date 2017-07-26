package ch02.ex2_2_CustomAccessors
//Intellij throws a warning on the above package statement, but apparently it is legal kotlin

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() {
            return height == width
        }
}

fun main(args: Array<String>) {
    val rectangle = Rectangle(41, 43)
    println(rectangle.isSquare)
}
