package ch04.ex3_3_ClassDelegationUsingTheByKeyword

import java.util.HashSet

//classes are final by default
class CountingSet<T>(
        val innerSet: MutableCollection<T> = HashSet<T>()  //declare a innerSert var, not sure what the mutableCollection does yet
) : MutableCollection<T> by innerSet { //delegates the MutableCollection impl to innerset (like the decpratpr pattern

    var objectsAdded = 0

    //all other MutableCollection methods are available on innerSet but delegated to innerSet
    // we just override 2 of them
    override fun add(element: T): Boolean { //override the MutableCollection add, ie do not delegate
        objectsAdded++
        return innerSet.add(element)
    }

    override fun addAll(c: Collection<T>): Boolean { //override the MutableCollection.addAll
        objectsAdded += c.size
        return innerSet.addAll(c)
    }
}

fun main(args: Array<String>) {
    val cset = CountingSet<Int>()
    cset.addAll(listOf(1, 1, 2))
    println("${cset.objectsAdded} objects were added, ${cset.size} remain")
}
