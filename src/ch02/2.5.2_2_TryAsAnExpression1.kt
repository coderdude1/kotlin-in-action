package ch02.ex5_2_2_TryAsAnExpression1

import java.io.BufferedReader
import java.io.StringReader

fun readNumber(reader: BufferedReader) {
    val number = try { //assignment from try block
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        null  //note no return
    }

    println(number)
}

fun main(args: Array<String>) {
    val reader = BufferedReader(StringReader("not a number"))
    readNumber(reader)//prints 'null'
}
