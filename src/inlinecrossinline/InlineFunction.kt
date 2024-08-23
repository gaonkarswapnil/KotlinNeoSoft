package inlinecrossinline

import java.time.LocalDateTime

fun main() {
    calculateTime {
        loop(10000)
    }
}

inline fun calculateTime(fn: () -> Unit){
    val start = System.currentTimeMillis()
//    println("start")
    fn()
    val end = System.currentTimeMillis()
//    println("end")
    println(end - start)
}

fun loop(n: Long){
    for(i in 1..n){

    }
}