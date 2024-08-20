package extensionfunctions

fun main() {
    println("Hello World!".format())
}

fun String.format(): String{
    return "---------------\n$this\n---------------\n"
}