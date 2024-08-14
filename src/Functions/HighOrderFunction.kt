package Functions

fun highOrderFunction(i: Int, j: Int, fname: (Int, Int) -> Int) {
    println(fname(i, j))
}

fun adds(a: Int, b: Int): Int {
    return a + b
}

fun highOrderFunction2(a: Int, b: Int, c: Int, fname: (Int, Int, Int) -> Int) {
    println(fname(a, b, c))
}

fun main() {
//    val add: (Int, Int) -> Int = { a, b -> a + b }
    highOrderFunction(1, 2, ::adds)
    highOrderFunction2(10,20,30, {a,b,c -> (a+b+c)/3})


//    val person = StringBuilder().apply {
//        append("Name: ")
//        append("John")
//    }
//    println(person) // Output: Name: John
//
//
//    val length = StringBuilder("Hello").run {
//        append(" World");
//        length;
//    }
//    println(length)
    println(sum(2,5) { a, b -> a + b })

    val data:(Int) -> Int = { num -> num + 2}

    println(data(10))
}

fun sum(a: Int, b: Int, op:(Int, Int) -> Int): Int {
    return a+b;
}