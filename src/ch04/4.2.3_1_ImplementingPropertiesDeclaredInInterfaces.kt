package ch04.ex2_3_1_ImplementingPropertiesDeclaredInInterfaces

fun getFacebookName(accountId: Int) = "fb: $accountId"

interface User {
    val nickname: String //abstract interfacd property
}

//Nickname is implemented in primary constructor here note override
class PrivateUser(override val nickname: String) : User

class SubscribingUser(val email: String) : User {
    //no backing property either.  nickName is implemented via custom getter (override)
    //custom getter.  Not sure ATM how this maps to the nickname field
    override val nickname: String get() = email.substringBefore('@')
}

class FacebookUser(val accountId: Int) : User {
    //note thie diff between this and SubscribingUser to see where the backing field happens (= vs : )
    override val nickname = getFacebookName(accountId) //property initiailzer to above function.  backing field that stores the value
}

fun main(args: Array<String>) {
    println(PrivateUser("test@kotlinlang.org").nickname)
    println(SubscribingUser("test@kotlinlang.org").nickname)

//    var privateUser = PrivateUser("test@kotlin.org")
//    privateUser.nickname = "blargh@blarg.com"  //val cannont be reassigned.  work witha var?
    val facebookUser = FacebookUser(1)
    println(facebookUser) //ch04.ex2_3_1_ImplementingPropertiesDeclaredInInterfaces.FacebookUser@76ed5528
    println(facebookUser.nickname) //fb:1 invokes FacebookUser.getter ofr nickname
}
