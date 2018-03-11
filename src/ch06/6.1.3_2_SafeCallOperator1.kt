package ch06.ex1_3_2_SafeCallOperator1

class Employee(val name: String, val manager: Employee?)

//returns a nullable string
fun managerName(employee: Employee): String? = employee.manager?.name //if manager is null return null rather than calling .name


fun main(args: Array<String>) {
    val ceo = Employee("Da Boss", null)
    val developer = Employee("Bob Smith", ceo)
    println(managerName(developer))
    println(managerName(ceo))
}
