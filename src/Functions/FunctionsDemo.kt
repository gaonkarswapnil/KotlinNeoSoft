package Functions

fun printData(vararg data: Int){
    for(i in data){
        println(i)
    }
}

fun main() {
    var arr = arrayOf(1,2,3,4,5)
    printData(1,2,3,4,5)
}