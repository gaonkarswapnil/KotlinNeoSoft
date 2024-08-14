package Constructor

class Person(var name: String, var age: Int, var email: String) {
    constructor(name: String, age: Int):this(name, age,"not_provided@example.com");

    val greeting: String
        get() = "Hello my name is $name, $age, $email"

    fun isAdult(): Boolean{
        if(age > 18){
            return true
        }
        return false
    }
}

fun main(args: Array<String>) {
    var person = Person("Swapnil", 23)
    println(person.greeting)
    println(person.isAdult())

    person = Person("Oliver", 17, "oliver@example.com")
    println(person.greeting)
    println(person.isAdult())
}