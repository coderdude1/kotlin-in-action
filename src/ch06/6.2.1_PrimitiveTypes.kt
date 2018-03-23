package ch06.ex2_1_PrimitiveTypes

fun showProgress(progress: Int) {
    //coerceIn restricts the receiver to the range (in this ex 0, 100)
    val percent = progress.coerceIn(0, 100)
    println("We're ${percent}% done!")
}

fun main(args: Array<String>) {
    showProgress(146) //returns 100
}
