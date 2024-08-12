package loops

fun main() {
    for (i in 1..5){
        println(i)
    }

    for (i in 1 until 10){
        println(i)
    }

    for (i in 10 downTo 1){
        println(i)
    }

    for (i in 1..10 step 2){
        println(i)
    }

    var arr = arrayOf(2,4,6,8,10)
    for(i in arr){
        println(i)
    }

    for (i in arr.indices){
        println(i)
    }

    for((indices, value) in arr.withIndex()){
        println("$value at index $indices")
    }
}