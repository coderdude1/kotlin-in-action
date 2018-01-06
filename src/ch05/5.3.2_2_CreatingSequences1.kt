package ch05.ex3_2_2_CreatingSequences1

import java.io.File

/**
 * Using a sequence to walk a directory tree.  can replace .any with .fihnd to look for something
 * specific
 *
 * I think ocnce it finds a hidden dir it
 *
 * I need to work with this more to understand it better
 *
 * this is an exntensino function on java File, so 'this' will refer to the file defined in the main function
 * the it.parentFile will map to the getParentFile method on the java File instance
 * any(it.isHiddden) returns if the predicate is matched.  .HiddenDir will return true
 * */
fun File.isInsideHiddenDirectory() =
        generateSequence(this) { it.parentFile }.any { it.isHidden }

fun main(args: Array<String>) {
    val file = File("/Users/svtk/.HiddenDir/a.txt")
    println(file.isInsideHiddenDirectory())
}
