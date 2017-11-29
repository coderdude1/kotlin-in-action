package ch04.ex3_1_2_1_ObjectEqualityEquals

class Client(val name: String, val postalCode: Int)

fun main(args: Array<String>) {
    val client1 = Client("Alice", 342562)
    val client2 = Client("Alice", 342562)
    // == delegates to the .equals() method use === for reference equality
    println(client1 == client2) //prints false since it is invoking the default equals which is checking reference comparison
}
