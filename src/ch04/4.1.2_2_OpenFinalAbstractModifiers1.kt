package ch04.ex1_2_2_OpenFinalAbstractModifiers1

interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!")
}

open class RichButton : Clickable {
    final override fun click() {} //final makes it not overridable even tho it overrides the Clickable click.  overriding a parent implies open
}

/*
by being final by default this enables smart casting to work in more situations
 */