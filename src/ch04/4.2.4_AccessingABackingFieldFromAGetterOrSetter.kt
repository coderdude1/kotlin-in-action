package ch04.ex2_4_AccessingABackingFieldFromAGetterOrSetter

class User(val name: String) { //default constructor declares name field
    var address: String = "unspecified"  //address is the backing field with default value
        set(value: String) { //setters can read/update backing fields, getters can read only
            //logs the action
            println("""
                Address was changed for $name:
                "$field" -> "$value".""".trimIndent()) //access the field via $
            field = value   //actual setting of the field
        }
}

fun main(args: Array<String>) {
    val user = User("Alice")
    user.address = "Elsenheimerstrasse 47, 80687 Muenchen"  //invokes the setter
}
