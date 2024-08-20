package extensionfunctions

fun main() {
    println(5.greater(40))
}

fun Int.greater(other: Int): Int {
    if (this > other) {
        return this
    }
    else {
        return other
    }
}