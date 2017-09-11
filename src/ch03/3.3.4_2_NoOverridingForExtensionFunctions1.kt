package ch03.ex3_4_2_NoOverridingForExtensionFunctions1

open class View {   //open means open for extesnion
    open fun click() = println("View clicked")
}

class Button: View() {  //default private (ie not open)
    override fun click() = println("Button clicked")
}

fun View.showOff() = println("I'm a view!") //extension function on View
fun Button.showOff() = println("I'm a button!") //extension function on Button (not an override!)

fun main(args: Array<String>) {
    val view: View = Button()  //button extends view
    view.showOff()  //"Im a view!" note not button cannot override an extension, thus button.view is not called
    view.click() //"button clicked"

    //extension functions are not part of the class, they appear to be compiled to static fn in java
}
