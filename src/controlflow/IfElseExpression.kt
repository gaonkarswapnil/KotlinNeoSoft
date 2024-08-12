package controlflow

fun main() {
    var num = 10
    if (num > 0) {
        println("Number in greater than 0")
    } else if (num == 0) {
        println("Number in 0")
    } else {
        println("Number is less than 0")
    }

    var x = 10
    var y = 11.3
    var test = if (x > y) {
        "x is greater than y"
    } else{
        "x is less than y"
    }

    println(test)
}