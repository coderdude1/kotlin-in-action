package ch04.main

class Button : Clickable, Focusable {  //implements 2 interfaces (the ':' is same as extends and implements
    override fun click() = println("I was clicked") //overrides are required in kotlin to prevent accidently overriding a parent fn

    override fun showOff() {    //both interfaces have a showOff therefor override
        super<Clickable>.showOff()  //delegate to clickable showoff
        super<Focusable>.showOff()  //delegate to Focusable showoff
    }
}

interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!")
}

interface Focusable {
    fun setFocus(b: Boolean) =
        println("I ${if (b) "got" else "lost"} focus.")

    fun showOff() = println("I'm focusable!")
}

fun main(args: Array<String>) {
    val button = Button()
    button.showOff()
    button.setFocus(true)
    button.click()
}
