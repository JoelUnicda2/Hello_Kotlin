import java.util.*

class AMS {
}

fun feedfish() {
    val  day = randonDay()
    val food = fishfood(day)
    println("Today is $day and I ate $food")
    shouldChangeWater(day, 20, 20)
    shouldChangeWater("Monday")
    shouldChangeWater(day)
    shouldChangeWater(day, dirty = 50)
    shouldChangeWater(day = "Tuesday")

    if (shouldChangeWater(day)) {
        println("Change the water today")
    }
}

fun randonDay( ) : String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}

fun randonfood( ) : String {
    val food = listOf("flakes", "redworms", "granules", "mosquitoes")
    return food[Random().nextInt(4)]
}

fun fishfood ( day: String ) : String {

    var food = "nothing"
    when  (day) {
        "Monday" -> food = "flakes"
        "Tuesday" -> food = "granules"
        "Wednesday" -> food = "redworms"
        "Thursday" -> food = "granules"
        "Friday" -> food = "mosquitoes"
        "Saturday" -> food = "plankton"
        "Sunday" -> food = "plankton"
    }
    return food
}



fun getFortuneCookie(): String {
    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )

    print("Enter your birthday: ")
    val birthday = readLine()?.toIntOrNull() ?: 1
    return fortunes[birthday % fortunes.size]
}
