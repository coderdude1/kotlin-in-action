package ch05.ex3_2_1_CreatingSequences

fun main(args: Array<String>) {
    //generateSequence is a kotlin func, arg is seed lambda is incementing func
    val naturalNumbers = generateSequence(0) { it + 1 }
    //returns a new seq based on the original, bound by the predicate in takeWhile
    val numbersTo100 = naturalNumbers.takeWhile { it <= 100 }
    println(numbersTo100.sum())//terminal op triggers all operations to go
}
