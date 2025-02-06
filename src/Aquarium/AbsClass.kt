package Aquarium


abstract  class AquariumFish {
    abstract  val color: String
}

class  shark : AquariumFish(), fishAction {
    override val color = "Grey"
    override  fun eat(){
        println("hunt and eat fish")
    }
}
class  plecostome : AquariumFish(), fishAction {
    override  val  color = "Gold"
    override fun eat() {
            println("munch on algae")
    }
}


interface fishAction {
    fun eat()
}






fun main (args: Array<String>) {
    delegate()
}

fun delegate() {
    val pleco = Plecostomus()
    println("Fish has color ${pleco.color}")
    pleco.eat()
}

interface FishAction {
    fun eat()
}

interface FishColor {
    val color: String
}

object GoldColor : FishColor {
    override val color = "Yellow"
}

class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}

class Plecostomus (fishColor: FishColor = GoldColor):
    FishAction by PrintingFishAction("eat a lot of algae"),
    FishColor by fishColor