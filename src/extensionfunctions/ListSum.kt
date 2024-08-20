package extensionfunctions

fun main() {
    var list = listOf(1,2,3,4,5)
    println(list.sum())
}

fun List<Int>.sum(): Int{
    var sum = 0
    this.forEach {sum+=it}
    return sum;
}