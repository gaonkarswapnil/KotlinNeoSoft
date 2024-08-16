fun digitCount(vararg data: Int) {
    var sum: Int = data.sum();
    var num: Int;

    println(sum)

    while (sum > 10) {
        num = sum % 10;
        sum /= 10;
        sum *= num
        println(sum)
    }


    println(sum)
}


fun main(args: Array<String>) {
    digitCount(123, 456, 789)
}