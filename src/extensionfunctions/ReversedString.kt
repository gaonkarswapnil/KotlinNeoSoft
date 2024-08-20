package extensionfunctions

fun main() {
    println("Hello".reversedStr())
}

fun String.reversedStr():String{
    var str: String="";
    for (i in this.length-1 downTo 0){
        str += this[i];
    }
    return str
}
