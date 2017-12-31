package ch05.ex1_5_2_MemberReferences1

data class Person(val name: String, val age: Int)

/*
Note in kotlin they are called member references vs method reference.  You can access things
other than methods (ie properties, etc)
 */
fun main(args: Array<String>) {
    val createPerson = ::Person //constructor reference, links to default Person constructor (hover over it in intelilj)
    val p = createPerson("Alice", 29)  //use the member reference.
    println(p)
}

fun Person.isAdult() = age >= 21
val predicate = Person::isAdult //Using a member reference to access an extension function

/*
TODO research bound method/member/property references in kotlin 1.1/1.2, book covers 1.0 and 1.1

In 1.0 when you take a refence to a method/property, you need to provide an instance of the class
when you call the reference.  In 1.1
 */


val p = Person(name="blargh", age = 22)
val pAdult = p.isAdult()