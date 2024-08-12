package variableanddatatype

fun main() {
    val achar: Char = 'A'
    println(achar)

    var character: Char = '2'
    val int: Int = character.digitToInt();
    println(int::class.java.name)

    println('\uFF00')
}