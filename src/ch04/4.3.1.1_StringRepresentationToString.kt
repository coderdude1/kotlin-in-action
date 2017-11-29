package ch04.ex3_1_1_StringRepresentationToString

class Client(val name: String, val postalCode: Int) {
    //default toString prints "ch04.ex3_1_1_StringRepresentationToString.Client@5e481248"
    override fun toString() = "Client(name=$name, postalCode=$postalCode)" //override the default toString
}

fun main(args: Array<String>) {
    val client1 = Client("Alice", 342562)
    println(client1)
}
