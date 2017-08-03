package ch02.ex5_1_TryCatchAndFinally

import java.io.BufferedReader
import java.io.StringReader

//kotlin does not differentiate between checked and unchecked exceptions
fun readNumber(reader: BufferedReader): Int? { //note no 'throws'
    try {   //java style try/catch
        val line = reader.readLine()
        return Integer.parseInt(line)
    }
    catch (e: NumberFormatException) {
        return null
    }
    finally {
        reader.close()
    }
}

fun main(args: Array<String>) {
    val reader = BufferedReader(StringReader("239"))
    println(readNumber(reader)) //note if null it actually prints "null"
}
