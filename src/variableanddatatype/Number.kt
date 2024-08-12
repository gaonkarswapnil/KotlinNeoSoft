package variableanddatatype

fun main() {
//    There are two Variables in kotlin
//    1. var: we can change the value once it is assign
    var data: String = "Hello World"
    data = "Hola.."

//    2. val:  we cannot change the value once it's assign
    val text: String = "Hello World"
//    text = "Hola"             --------------> ERROR


//    DataType
//    1. Number
//      a. Byte
    val numberByte: Byte = 2
    println("\nByte is $numberByte")
    println("Min is ${Byte.MIN_VALUE}")
    println("Max is ${Byte.MAX_VALUE}")

//      b. Short
    val numberShort: Short = 5
    println("\nShort is $numberShort")
    println("Min is ${Short.MIN_VALUE}")
    println("Max is ${Short.MAX_VALUE}")

//      c. Int
    val numberInt: Int = 243
    println("\nInt is $numberInt")
    println("Min is ${Integer.MIN_VALUE}")
    println("Max is ${Integer.MAX_VALUE}")

//      d. Long
    val numberLong: Long = 1L
    println("\nLong is $numberLong")
    println("Min is ${Long.MIN_VALUE}")
    println("Max is ${Long.MAX_VALUE}")


//      e. Float
    val numberFloat: Float = 3.14F
    println("\nFloat is $numberFloat")
    println("Min is ${Float.MIN_VALUE}")
    println("Max is ${Float.MAX_VALUE}")

//      f. Double
    val numberDouble: Double = 3.14
    println("\nDouble is $numberDouble")
    println("Min is ${Double.MIN_VALUE}")
    println("Max is ${Double.MAX_VALUE}")
}

