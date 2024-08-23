package typesofclasses.DataClass

/*
    Any class contains functions such as :
    equals(): Boolean
    hashCode(): Int
    toString(): String
    Kotlin creates to copy() too
    Data Classes provide these mentioned methods
*/

data class User(var name: String, var id: Int){

}

fun main() {
    val user1 = User("John", 34)
    val user2 = User("John", 34)
    if(user1 == user2) {
        println("Equal")
    }else{
        println("Not Equal")
    }
}