package geometry.example

import geometry.shapes.createRandomRectangle  //this is a function in the Rectangle.kt File note that the path does not match

fun main(args: Array<String>) {
    println(createRandomRectangle().isSquare)
}
