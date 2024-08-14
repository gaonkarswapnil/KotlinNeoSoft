package Functions

fun main() {
    var arr = mutableListOf<Int>();
    arr.add(2)
    arr.add(4)
    arr.add(6)
    arr.add(8)
    arr.add(10)

    arr.stream().forEach{ it -> println(it * it) }

    var array = arrayOf(1,2,3,4)
    var sum = 0;
    array.forEach { it -> sum += it }

    println(sum)
}