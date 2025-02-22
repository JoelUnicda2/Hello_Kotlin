class Fortune {
}

fun getBirthday(): Int {
    print("Enter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}

fun getFortuneCookie(birthday: Int): String {
    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )

    return when {
        birthday == 28 || birthday == 31 -> "Enjoy a fantastic birthday celebration!"
        birthday in 1..7 -> "Start your week with positive energy!"
        else -> fortunes[birthday % fortunes.size]
    }
}


fun main(args: Array<String>) {
    var fortune: String

    repeat(10) {
        fortune = getFortuneCookie(getBirthday())
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) return
    }


//fun main(args: Array<String>) {
//   var fortune: String
//   for (i in 1..10) {
//      fortune = getFortune(getBirthday())
//      println("\nYour fortune is: $fortune")
//      if (fortune.contains("Take it easy")) break;
//   }
//}

}
