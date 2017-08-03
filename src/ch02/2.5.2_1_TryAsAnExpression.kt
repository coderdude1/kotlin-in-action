package ch02.ex5_2_1_TryAsAnExpression

import java.io.BufferedReader
import java.io.StringReader

fun readNumber(reader: BufferedReader) { //note no return type
    val number = try {  //note assignment from try block, from the return
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        return  //nothing gets printed.
    }

    println(number)
}

fun main(args: Array<String>) {
    val reader = BufferedReader(StringReader("Not a number"))
//    val reader = BufferedReader(StringReader("111"))//prints 111,
    readNumber(reader)//doesn't print anything if not a number
}
