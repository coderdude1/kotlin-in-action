package strings

/*
in kotlin you can add methods to existing classes/objects rather than create Util classes with methods.

The book calls these 'extension functions'

 */
//I think this is a top level prppert that becomes a maybe a static and can be accessed from java via imlicit
// getter/setter since var (not val)

/*
    in kotlin accessing this looks like:
    import strings.*
    import strings.lastChar  //note you can import a single function
    import strings.lastChar as last
        val lastChar = 'blargh'.last()
 */
var someProperty = "blargh"

//this becomse a static method available in java ie strings.lastChar("string to parse")
fun String.lastChar(): Char = this.get(this.length - 1)  //adds .lastChar fun to the String class

fun main(args: Array<String>) {
    println("Kotlin".lastChar())
}
