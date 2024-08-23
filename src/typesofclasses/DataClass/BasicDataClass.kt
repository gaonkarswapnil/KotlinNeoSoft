package typesofclasses.DataClass

data class Book(val title:String, val author: String, val publishedYear: Int){

}

fun main() {
    val book1 = Book("Harry Pottetr","J.K. Rowling", 2004);
    val book2 = Book("Harry Pottetr","J.K. Rowling", 2004)

    if(book1 == book2){
        println("Equal")
    }else{
        println("Not equal")
    }
}