fun main(){
    filtere()
}


fun filtere() {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper")

    // Get all items containing 'curry' and sort by length
    val sortedCurries = spices.filter { it.contains("curry") }.sortedBy { it.length }
    println("Sorted curries: $sortedCurries")

    // Filter items starting with 'c' and ending with 'e' (method 1)
    val filter1 = spices.filter { it.startsWith('c') && it.endsWith('e') }
    println("Filtered spices (method 1): $filter1")

    // Filter items starting with 'c' and ending with 'e' (method 2)
    val filter2 = spices.filter { it.matches(Regex("^c.*e$")) }
    println("Filtered spices (method 2): $filter2")

    // Take the first three elements and filter those starting with 'c'
    val firstThreeStartingWithC = spices.take(3).filter { it.startsWith('c') }
    println("First three starting with 'c': $firstThreeStartingWithC")




}