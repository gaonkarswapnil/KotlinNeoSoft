package inlinecrossinline

fun main(){
    repeatAction(5){
        println("Hello")
    }
}

inline fun repeatAction(n:Int, fn: ()->Unit){
    repeat(n){
        fn()
    }
}