package Aquarium.Decorations


class Book(val title: String, val author: String, val year: Int) {


    fun getTitleAndAuthor(): Pair<String, String> {
        return Pair(title, author)
    }


    fun getBookInfo(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }
}

fun main() {


    val book = Book("1984", "George Orwell", 1949)


    val (title, author) = book.getTitleAndAuthor()
    println("Title and Author: $title, $author")


    val (bookTitle, bookAuthor, bookYear) = book.getBookInfo()
    println("Here is your book \"$bookTitle\" written by $bookAuthor in $bookYear.")
}
