package ch05.ex3_1_1_ExecutingSequenceOperations

import java.util.stream.Collectors

/*
    The filter and map functions return a collection, meaning that kotlin will martial the results
    of each step into an intermediate question. Fine for small collections but expensive for larte ones

    The asSequence will instead make it behave like a java stream with no intemediate collection

    note there are pros/cons to each approach, ie its not always better to use sequences vs intermediate
    collections

    section 8.2 in the book discusses which is better to use when

   kotlin sequences might be like java 8 steams vs a foreach
      confirmed that kotlin sequences are the saee as java8 streams but can be used on older jdks
      kotlin currently does not appear to support parrallelSequnce like java 8
   sequences support intermediate and terminal operations

   using a sequnce requires a terminal operation for everything to 'happen', like a java8 stream

note map before filter, same ruls as java filter first, then transform as can be much more efficient
as you only transform filtered stuff vs everything in this example

One way to think of this is the non-sequence version operats on the entire collection at each step.
the sequnce version works on one element at at time from the collection
 */
fun main(args: Array<String>) {
    val listOfStuff = listOf(1, 2, 3, 4)
    listOfStuff.asSequence()
            .map { print("map($it) "); it * it }//prints map 1, 2, 3,4;  returns it^2
            .filter { print("filter($it) "); it % 2 == 0 } //note it is it^2 from previous
            .toList() //comment this line to make it the same as original.  it results in everythibg printing
    println("")
    //the previous code will not print anything, since this starts with asSequence and the map/filter
    //operations are intermediate operations.  We need to add a terminal operation to make it work

    listOfStuff.parallelStream()
            .map { print("map($it) "); it * it }//prints map 1, 2, 3,4;  returns it^2
            .filter { print("filter($it) "); it % 2 == 0 } //note it is it^2 from previous
//            .toList() // this doesnt work since parallelStream is java not kotlin
            .collect(Collectors.toList())
}
