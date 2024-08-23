package typesofclasses.DataClass

open class Animal(open val name: String, open val age: Int){

}

data class Dog(override val name: String, override val age: Int, val breed: String): Animal(name, age)

fun main() {
    val dog = Dog("Dog", 12,"German");
    println(dog)
    println()
}

