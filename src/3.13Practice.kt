fun main() {
    println(whatShouldIDoToday(mood = "happy", weather = "rainy", temperature = 24))
}


fun whatShouldIDoToday(
    mood: String,
    weather: String = "sunny",
    temperature: Int = 24
): String {
    return when {
        mood == "happy" && weather == "sunny" -> "go for a walk"
        mood == "sad" && weather == "rainy" -> "stay in bed"
        temperature < 0 -> "Stay inside and drink hot chocolate"
        temperature > 35 -> "go swimming"
        weather == "rainy" -> "Stay in and watch movies"
        else -> "Stay home and read."
    }
}


