package extensionfunctions

open class Animal {
}

class Dog(val breed: String): Animal(){

}

fun main() {
    val dog = Dog("breed")
    println(dog.specificMsg())
    println(dog.genericMsg())
}

fun Animal.genericMsg(): String{
    return "This is an Animal Function"
}

fun Dog.specificMsg(): String{
    return "This is an ${breed} Dog  "
}