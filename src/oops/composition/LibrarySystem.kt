package oops.composition

data class Author(var name: String)

data class Category(var name: String)

class Book(val title: String, val publicationYear: Int){
    val authors: MutableList<Author> = mutableListOf()
    val categories: MutableList<Category> = mutableListOf()

    fun addAuthor(author: Author){
        authors.add(author)
    }

    fun addCategory(category: Category){
        categories.add(category)
    }

    fun getDetails(){
        println("Title: $title, publicationYear: $publicationYear \nCategory: ${categories.joinToString()}, Author: ${authors.joinToString()} ")
    }
}

fun main(){
    val author1 = Author("J.K. Rowling")
    val author2 = Author("Stephen King")

    val category1 = Category("Fantasy")
    val category2 = Category("Thriller")

    val book = Book("Harry Potter", 2002)
    book.addAuthor(author1)
    book.addAuthor(author2)
    book.addCategory(category1)
    book.addCategory(category2)

    book.getDetails()
}