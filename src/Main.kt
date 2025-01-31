import java.util.Calendar

fun main(args: Array<String>) {
    println("Hello, world!")

    dayoftheweek()
}
fun dayoftheweek(dayOfWeek: Int = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)) {

    println("What day is today? $dayOfWeek")

}