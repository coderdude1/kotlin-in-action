package ch04.ex3_1_2_2_ObjectEqualityEquals1

class Client(val name: String, val postalCode: Int) {
    //any is like Object in java
    override fun equals(other: Any?): Boolean { //override default equals to use properties instead
        if (other == null || other !is Client)  //is is like instanceOf
            return false
        return name == other.name &&
               postalCode == other.postalCode
    }

    //note no hashCode so this is incomplete
    override fun toString() = "Client(name=$name, postalCode=$postalCode)"
}

fun main(args: Array<String>) {
    val processed = hashSetOf(Client("Alice", 342562))
    println(processed.contains(Client("Alice", 342562)))
}
