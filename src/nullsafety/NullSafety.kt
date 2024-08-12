package nullsafety

fun main() {
    var str: String = "Hello"
//    str = null;               --------------> ERROR

    var myStr: String? = "Hello World"
//    myStr = null
//    println(myStr.length)     ---------------> ERROR

    if(myStr == null){
        throw NullPointerException("String is null")
    }
    println(myStr.length)

    var a: String? = "Hola"
    var b: String? = null
    println(a?.length)
    println(b?.length)


    val length: Int = b?.length?:-1;
    println(length)

    println(b!!.length)


    val name: String? = null
    name?.let { println(name.length) }

}