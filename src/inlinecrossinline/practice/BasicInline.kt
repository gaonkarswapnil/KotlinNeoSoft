package inlinecrossinline.practice

inline fun setupAndRun(noinline setup: ()-> Unit, crossinline action: ()->Unit) {
    setup()
    val  runAction = {
        action()
    }
    runAction()
}

fun main() {
    val setUpAction  ={
        println("Setup done")
    }
    setupAndRun(setup = setUpAction, action = {
        println("Running Action")
    } )
}