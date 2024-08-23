package inlinecrossinline

fun main(){
    printTwice {
        println("Hello World!")
    }
}

inline fun printTwice(fn: ()->Unit){
    repeat(2){
        fn()
    }
}