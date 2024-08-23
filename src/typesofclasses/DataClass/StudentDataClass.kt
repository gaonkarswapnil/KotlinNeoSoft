package typesofclasses.DataClass

data class Student(val name: String, val age: Int, val grade: String) {

}

data class Address(val street: String, val city: String, val postalCode: String){

}

fun main() {
    val student = Student("Oliver", 25, "A")
    val copyStudent = student.copy(grade = "C")

    println(student)
    println(copyStudent)

    val address = Address("Dallas street", "Gotham City", "421306")

    var (name, age, grade) = student
    var (street, city, postalCode) = address

}