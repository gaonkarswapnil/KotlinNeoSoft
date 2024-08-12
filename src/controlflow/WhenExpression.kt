package controlflow

fun isEvenNum(num: Int): Boolean {
    if(num%2==0){
        return true
    }
    return false;
}

fun main() {
    var arr = arrayOf(1,2,3,4,5)
    arr.forEach {
        when{
            isEvenNum(it) -> println("$it is Even Number")
            else -> println("$it is ODD")
        }
    }



    val grade = 'B'

    val result = when (grade) {
        'A', 'B' -> "Excellent"
        'C' -> "Good"
        'D' -> "Pass"
        'F' -> "Fail"
        else -> "Invalid grade"
    }

    println("Grade: $grade, Result: $result")

}