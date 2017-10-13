package ch04.ex2_1_InitializingClasses

/*
  primary constructor, defines properties at same time (and default value for isSubscribed).  vs using
  the 'constructor' keyword and initializer

  if each property has a default value, the compiler will generate a no arg constructor that sets the
  default values for all props (useful with java)

  the traditional way that we learned to declare a class primary constructor
 */
class User(val nickname: String,
           val isSubscribed: Boolean = true)

fun main(args: Array<String>) {
    val alice = User("Alice")
    println(alice.isSubscribed)
    val bob = User("Bob", false)
    println(bob.isSubscribed)
    val carol = User("Carol", isSubscribed = false)
    println(carol.isSubscribed)

    println(carol) //ch04.ex2_1_InitializingClasses.User@5e481248 not sure why default toString
}
