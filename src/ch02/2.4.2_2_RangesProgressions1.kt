package ch02.ex4_2_2_RangesProgressions1

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz "
    i % 3 == 0 -> "Fizz "
    i % 5 == 0 -> "Buzz "
    else -> "$i "
}

fun main(args: Array<String>) {
    for (i in 100 downTo 1 step 2) { //downto makes it count in reverse, step 2 makes it count by 2.  Note there is an until fun to make it uninclusive (endp number not included)
        println(fizzBuzz(i))
    }
}
