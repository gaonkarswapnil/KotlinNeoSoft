package extensionfunctions

fun main() {
    println(StringBuilder("hello").toUpper().toAppend("World"))
}

fun StringBuilder.toUpper(): StringBuilder{
    var upper = this.toString().uppercase()
    return StringBuilder(upper);
}

fun StringBuilder.toAppend(suffix: String): StringBuilder? {
    return this.append(suffix);
}

