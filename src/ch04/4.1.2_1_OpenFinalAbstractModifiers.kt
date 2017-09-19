package ch04.ex1_2_1_OpenFinalAbstractModifiers

interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!") //default method/fn like java 8
}

open class RichButton : Clickable {  //open for extension.  extends clickable.  kotlin by default is final therefore not overridable

    fun disable() {} //final by default, cannot be overridden

    open fun animate() {}  //fun is open for extension, can be overridden in a subclass

    override fun click() {} //overrides click in interface, open by default
}
