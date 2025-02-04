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
    canAddFish2(2.0, listOf(2), 1 , true)
}


fun canAddFish2(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
    return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)
}