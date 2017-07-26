package geometry.shapes
//note that the package does not match the file system path, but kotlin can resolve it.  Intellij warns on it tho.
//apparently the warning is assuming you are mixing java and kotlin

import java.util.Random

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width
}

fun createRandomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}
