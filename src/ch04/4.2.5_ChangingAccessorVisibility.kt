package ch04.ex2_5_ChangingAccessorVisibility

class LengthCounter {
    var counter: Int = 0
        private set //private setter only visible in the class

    fun addWord(word: String) {
        counter += word.length
    }
}

fun main(args: Array<String>) {
    val lengthCounter = LengthCounter()
    lengthCounter.addWord("Hi!")
    println(lengthCounter.counter)
}
