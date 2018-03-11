package ch06.ex1_3_3_SafeCallOperator2

class Address(val streetAddress: String, val zipCode: Int,
              val city: String, val country: String)

//name is not nullable, address is nullable
class Company(val name: String, val address: Address?)

//name is not nullable, company is nullable
class Person(val name: String, val company: Company?)

fun Person.countryName(): String {
   val country = this.company?.address?.country //note the nullSafe chain
   return if (country != null) country else "Unknown"
}

fun main(args: Array<String>) {
    val person = Person("Dmitry", null) //company is null but safe to call
    println(person.countryName())//part of company but it is null, this is still safe
}
