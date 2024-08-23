package inlinecrossinline

fun main(){
    callback ({
        println("Hola")
        return@callback
    },{
        println("Hello")
    })
}

inline fun callback(
    fn: () -> Unit,
    noinline anotherfn: () -> Unit
){
    fn();
    println("Data")
    anotherfn();
}