import java.util.Calendar

fun main(args: Array<String>) {
    println("Hello, ${args[0]}!")

    greetingMain()

    dayoftheweek()

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

fun greetingMain() {
    val hora = Calendar.getInstance().get(Calendar.HOUR_OF_DAY)

    println(when (hora){
        in 1..12 -> "Good Morning"
        in 12..17 -> "Good Afternoon"
        in 17..20 -> "Good Evening"
        else -> "Good Night"
    })


}

