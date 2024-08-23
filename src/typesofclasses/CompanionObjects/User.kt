package typesofclasses.CompanionObjects

class User(var name: String, var age: String) {
    companion object{
        fun format(str: String): User {
            val (name, age)  = str.split(",");
            return User(name, age);
        }
    }

    override fun toString(): String {
        return "User(name='$name', age='$age')"
    }

}

fun main() {
    var user1= User.format("Swapnil,25");

    println(user1)

}