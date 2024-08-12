package variableanddatatype

fun main() {
    var numbers = arrayOf(1,2,3,4,5)
    println(numbers.joinToString())
    for(number in numbers)
        println(number)

    var number = arrayOf(arrayOf(1,2,3),arrayOf(4,5,6),arrayOf(7,8,9))
    println(number.contentDeepToString())

    numbers.forEach { it -> println(it*2) }


}