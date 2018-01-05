package ch05.ex3_1_2_ExecutingSequenceOperations1

fun main(args: Array<String>) {
    listOf(1, 2, 3, 4).asSequence()
            .map { print("map($it) "); it * it } //print it (1, 2, 3, 4) outputs 1, 4, 9, 16 to stream
            .filter { print("filter($it) "); it % 2 == 0 }//consumes stream 1, 4 9  16 and mod appears to do nothing
            .toList()//terminal operation causes it all to 'happen'
}
