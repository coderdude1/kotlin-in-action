package ch03.ex3_4_1_NoOverridingForExtensionFunctions

open class View {       //open for extension
    open fun click() = println("View clicked") //open for extension
}

class Button: View() { //button is a subclass of View
    override fun click() = println("Button clicked")
}

fun main(args: Array<String>) {
    val view: View = Button()
    view.click()    //"Button clicked" gets output
}
