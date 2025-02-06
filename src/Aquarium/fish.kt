package Aquarium

class Fish (val friendly: Boolean = true, volumeNeeded: Int){
    val size : Int

    init {
        println("First initializer block")
    }

    constructor() : this (true, 9){
        println("Running secondary constructor")
    }
    init {
        if (friendly){
                size = volumeNeeded

        } else {
            size = volumeNeeded * 2
        }
    }

    fun makeDefaultFish() = Fish(true, 50)

    fun fishExample(){
        val fish = Fish(friendly = true, volumeNeeded = 20)
        println("Is the fish friendly? ${fish.friendly}. It needs volume ${fish.size} ")
    }
}