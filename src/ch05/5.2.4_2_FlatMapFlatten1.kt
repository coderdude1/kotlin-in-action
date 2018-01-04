package ch05.ex2_4_2_FlatMapFlatten1

class Book(val title: String, val authors: List<String>)

fun main(args: Array<String>) {
    val books = listOf(Book("Thursday Next", listOf("Jasper Fforde")),
                       Book("Mort", listOf("Terry Pratchett")),
                       Book("Good Omens", listOf("Terry Pratchett",
                                                 "Neil Gaiman")))
    val authors = books.flatMap { it.authors } //list of authors, 2 pratchett
    println(authors.toSet())//toSet eliminates dupes

    /*
    note that if you do not need to transform the collection of collections you can use
        listOfLists.flatten()
     */

    val nums = listOf(listOf("1", "3"), listOf("2", "4"))
    println(nums.flatten())
}
