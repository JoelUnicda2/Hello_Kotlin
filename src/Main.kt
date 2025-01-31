import java.util.Calendar

fun main(args: Array<String>) {
    println("Hello, ${args[0]}!")

    greetingMain(args)

    dayoftheweek()
    timeinanotherway(args)
}



fun dayoftheweek() {

    println("What day is today?")

    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println( when (day) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Time has stopped"
    })

}

fun greetingMain(args: Array<String>){
    val hora = Calendar.getInstance().get(Calendar.HOUR_OF_DAY)

    println(when (hora){
        in 1..12 -> "Good Morning"
        in 12..17 -> "Good Afternoon"
        in 17..20 -> "Good Evening"
        else -> "Good Night"
    })


}

fun timeinanotherway(args: Array<String>) {
    // Check if the user has provided an argument
    if (args.isNotEmpty()) {
        // Convert the argument (String) to an Int
        val time = args[0].toInt()

        // Use a simple if-else statement to check if it's before or after midday
        println(if (time < 12) "Good morning, Kotlin" else "Good night, Kotlin")
    } else {
        println("Please provide a time as an argument.")
    }
}