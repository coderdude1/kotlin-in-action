package ch04.ex3_2_1_DataClassCopy

//get an automatic equals/hashcode/toString/copy
data class Client(val name: String, val postalCode: Int)

fun main(args: Array<String>) {
    val bob = Client("Bob", 973293)
    println(bob.copy(postalCode = 382555)) //note use of automaticcaly created copy function override the postalCode
}
