package ch06.ex1_7_TheLetFunction

//note this function will not accept null
fun sendEmailTo(email: String) {
    println("Sending email to $email")
}

fun main(args: Array<String>) {
    //email is a nullable string
    var email: String? = "yole@example.com"
    //
    email?.let { sendEmailTo(it) }
    email = null
//    sendEmailTo(null)//compiler prevents this since sendEmailTo is not nullable
    //note safe call (?) before let()
    //let passes the email into the lambda as an arg (it).  Combined with safe call
    //alllws us to use stuff that may be null but not let it actually happen if it is null,
    // since the compiler wouldnt allow this(compile error)
    email?.let { sendEmailTo(it) }
}
