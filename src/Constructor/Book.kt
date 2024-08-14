package Constructor

import java.time.LocalDate

class Book(private var title: String, private var author: String, private var publicationYear: Int) {

    init {
        if(publicationYear > LocalDate.now().year){
            println("The publication year is $publicationYear is from future so publication year is set as ${LocalDate.now().year}")
            publicationYear = LocalDate.now().year
        }
    }

    val description: String
        get() = "Title: $title, Author: $author, Publication Year: $publicationYear"
}

fun main(args: Array<String>) {
    var book = Book("Harry Potter", "J.K ", 2050)
    println(book.description)
}