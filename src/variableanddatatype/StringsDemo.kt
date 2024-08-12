package variableanddatatype

import java.util.*

fun main() {
    var myString: String = "Hello World"
    println(myString)

    for (c in myString) {
        println(c)
    }

    println(myString.uppercase())
    println(myString.lowercase())

    var multilineStr = """
        > Hii Oliver
                    > Its a pleasure to meet you
    """.trimMargin(">")
    println(multilineStr)
}