package inlinecrossinline.practice

fun main() {
    initializeAndPerform(
        init = {
            println("Initializing ")
        },
        process = {
            println("Processing ")
        }
    )
}

inline fun initializeAndPerform(noinline init: ()-> Unit, crossinline process: ()-> Unit){
    val initializer = {
        init()
    }
    initializer()
    val processer = {
        process()
    }
    processer()
}