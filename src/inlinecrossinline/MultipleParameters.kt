package inlinecrossinline

fun main() {
    executeWith(5,5){a,b -> a+b}
}

inline fun executeWith(a: Int, b: Int, fn: (Int, Int)->Int){
    val result =  fn(a, b)
    println(result)
}