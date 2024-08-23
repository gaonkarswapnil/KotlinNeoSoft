package inlinecrossinline.practice

fun main() {
    execute(
        setup = { println("Set up ready") },
        action = { println("Invoking action") },
    )
}

inline fun execute(noinline setup: ()-> Unit, crossinline action: ()-> Unit){
    val runnable = {
        setup()
        action()
    }
    runnable()
}