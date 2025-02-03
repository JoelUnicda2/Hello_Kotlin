import java.util.*

class AMS {
}

fun feedfish() {
    val  day = randonDay()
    val food = "pellets"
    println("Today is $day and I ate $food")

}

fun randonDay( ) : String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}