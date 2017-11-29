package ch04.ex2_3_2_ImplementingPropertiesDeclaredInInterfaces1

/*
Interface with properties defined.  note no state is stored since it is an interface
 */
interface User {
    val email: String //any implementing class needs to provide a means to return this (not sure aboutset?)
    val nickname: String
        get() = email.substringBefore('@') //I think this is a getter for nickname
}
