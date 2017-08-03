package ch02.FizzBuzz

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz "
    i % 3 == 0 -> "Fizz "
    i % 5 == 0 -> "Buzz "
    else -> "$i "
}

//simple for loop, notice the range 1..100 instead of traditional for loop.  ranges are inclusive, ie 1 and 100 are valid in
//this example.  ranges can also be asssgined like val range = 1..100
fun main(args: Array<String>) {
    for (i in 1..100) {
        println(fizzBuzz(i))
    }
}
