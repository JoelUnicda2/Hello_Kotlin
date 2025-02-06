package Aquarium.Decorations


const val MAX_BORROWED_BOOKS = 5

class Book(val title: String, val author: String, val year: Int, var borrowedBooks: Int) {


    fun canBorrow(): Boolean {
        return borrowedBooks < MAX_BORROWED_BOOKS
    }


    fun printUrl() {
        println("${Companion.BASE_URL}$title.html")
    }


    companion object {
        const val BASE_URL = "https://library.example.com/books/"
    }
}

fun main() {

    val book = Book("1984", "George Orwell", 1949, 3)

    println("Can borrow more books? ${book.canBorrow()}")

    book.printUrl()
}
