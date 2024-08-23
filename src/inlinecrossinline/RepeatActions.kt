package inlinecrossinline

fun main() {
    repeatActions(5){number->println(number)}
}

inline fun repeatActions(n:Int, fn: (Int)-> Unit){
    for(i in 1..n){
        fn(i);
    }
}