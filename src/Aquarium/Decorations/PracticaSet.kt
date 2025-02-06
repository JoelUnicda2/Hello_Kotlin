package Aquarium.Decorations

fun main() {

    val allBooks = setOf("Hamlet", "Othello", "Macbeth", "Romeo and Juliet", "King Lear")

    val library = mapOf("William Shakespeare" to allBooks)


    val hasHamlet = library.values.flatten().any { it == "Hamlet" }
    println("¿La biblioteca contiene 'Hamlet'? $hasHamlet")


    val moreBooks = mutableMapOf("Pride and Prejudice" to "Jane Austen")
    println("Libros adicionales: $moreBooks")


    val newBook = "1984"
    val author = moreBooks.getOrPut(newBook) { "George Orwell" }

    println("Después de getOrPut: $moreBooks")
    println("Autor del libro '$newBook': $author")
}
