package extensionfunctions

fun main() {
    var list = listOf(1,2,3,4,5)
    println(list.EvenNumbers())
}

fun List<Int>.EvenNumbers(): List<Int> {
    val (even, odd) = this.partition { it % 2 == 0 }
    return even;
}