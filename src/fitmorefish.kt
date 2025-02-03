fun canAddFish(
    tankSize: Double,
    currentFish: List<Int>,
    fishSize: Int = 2,
    hasDecorations: Boolean = true
): Boolean {
    val maxFishLength = if (hasDecorations) tankSize * 0.8 else tankSize
    val currentFishLength = currentFish.sum()
    return (currentFishLength + fishSize) <= maxFishLength
}

fun main(){
    canAddFish(2.0, listOf(2), 1 , true)

}