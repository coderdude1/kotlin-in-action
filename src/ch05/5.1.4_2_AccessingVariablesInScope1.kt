package ch05.ex1_4_2_AccessingVariablesInScope1

fun printProblemCounts(responses: Collection<String>) { //duh inputs
    var clientErrors = 0  //function var
    var serverErrors = 0  //derp same
    responses.forEach { //start of lambda
        if (it.startsWith("4")) {
            clientErrors++  //vars declared outside of lambda still in scope
        } else if (it.startsWith("5")) {
            serverErrors++  //same
        }
    }
    println("$clientErrors client errors, $serverErrors server errors")
}

fun main(args: Array<String>) {
    val responses = listOf("200 OK", "418 I'm a teapot",
                           "500 Internal Server Error")
    printProblemCounts(responses)
}
