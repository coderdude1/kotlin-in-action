package ch02.ex4_3_IteratingOverMaps

import java.util.TreeMap

fun main(args: Array<String>) {
    val binaryReps = TreeMap<Char, String>()

    for (c in 'A'..'F') {  //note that the range isn't limited to numbers, it's smart
        val binary = Integer.toBinaryString(c.toInt()) //java static method to convert an Int to binary
        binaryReps[c] = binary //stuff it in the treemap (which is sorted by key)
    }

    for ((letter, binary) in binaryReps) { //iterates over the treemap, stuffing the key/value into 'letter' and 'binary'
        println("$letter = $binary") //substitution for vars
    }
}
