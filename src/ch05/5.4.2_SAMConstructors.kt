package ch05.ex4_2_SAMConstructors


/**
 * SAM - Single Abstract Method inteface, same as a functional intefrace in java 8
 *
 * Kotlin will allow you to pass in lambdas to java methods that take functional intefaces as args
 *
 * From the book:
 * A SAM constructor is a compiler-generated function that lets you perform an explicit conversion of
 * a lambda into an instance of a functional interface.
 *
 */
fun createAllDoneRunnable(): Runnable {
    return Runnable { println("All done!") }
}

fun main(args: Array<String>) {
    createAllDoneRunnable().run()
}
