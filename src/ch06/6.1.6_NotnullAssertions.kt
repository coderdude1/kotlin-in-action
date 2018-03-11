package ch06.ex1_6_NotnullAssertions

fun ignoreNulls(s: String?) {
    //!! is not nullcheck, throws NPE if null.  This is intentionally ugly as the lang
    //designers would prefer you stick with the other ways of null management
    //This is usually needed when using java/thrid party libs.  A good example is where a caller
    //of this function does a null check and you're pretty confident this will never get called
    //with a null.  the compilers knows that sNotNull.lenght will never get called if it is null
    //due to the !!  book page 135 has a Swing Action example of this
    //note exception will point to !! line, so best not to have more than one on a line
    val sNotNull: String = s!!
    println(sNotNull.length)
}

fun main(args: Array<String>) {
    ignoreNulls(null)
}
