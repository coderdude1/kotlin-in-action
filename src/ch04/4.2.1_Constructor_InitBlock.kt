package ch04

/**
 * this is a primary constructor using the constructor keyword, and a more verbose syntax with init.  this exmaple
 * is functionally the same as
 *   class User(val nickname: String)
 *
 *   The primary constructor is the one that follows the class keyword
 *
 *   the init block allows us to do more stuff in we need too
 */
class User constructor(_nickname: String) { //primary constructor 1 param
    val nickname: String
    //val nickname: String = _nickname //this would replace the initializer.  note you can do java style with the names
    //spelled the same, and use this.nickname = nickname
    init {          //required by the compiler if not using direct assignment (see commented line)
        nickname = _nickname
    }
}