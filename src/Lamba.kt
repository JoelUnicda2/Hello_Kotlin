import kotlin.random.Random


val rollDice1 = { Random.Default.nextInt(12) + 1 }

val rollDice = { sides: Int ->
    Random.Default.nextInt(sides) + 1
}

val rollDice0 = { sides: Int ->
    if (sides == 0) 0
    else Random.Default.nextInt(sides) + 1
}

val rollDice2: (Int) -> Int = { sides ->
    if (sides == 0) 0
    else Random.Default.nextInt(sides) + 1
}

fun main() {
    gamePlay(rollDice2(4))
}
fun gamePlay(diceRoll: Int){
    // do something with the dice roll
    println(diceRoll)
}