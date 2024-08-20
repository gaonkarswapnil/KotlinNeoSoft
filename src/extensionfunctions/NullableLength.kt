package extensionfunctions

fun main() {
    var str: String? = null
    println(str.nullLength())
}

fun String?.nullLength(): Int {
    if(this != null){
        return this.length
    }
    return 0
}