package ch04.Button1

import java.io.Serializable

interface State: Serializable  //state implements serialazable

interface View {
    fun getCurrentState(): State
    fun restoreState(state: State) {}
}

class Button : View {
    override fun getCurrentState(): State = ButtonState() //uses the inner class

    override fun restoreState(state: State) { /*...*/ }

    class ButtonState : State { /*...*/ }  //same as static nested class in java implements state interface

    /*
    nested classes do not reference the outer class.  Inner classes do
     */
}
