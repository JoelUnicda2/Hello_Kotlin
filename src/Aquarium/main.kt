package Aquarium

fun main (args: Array<String>){
    buildaquarium()
    makeFish()
}

fun buildaquarium(){

    val myAquarium = Aquarium()

    println("Length: ${myAquarium.length} " +
            "Width: ${myAquarium.width} " +
            "Height: ${myAquarium.height}")

    myAquarium.height = 80
    println("Height: ${myAquarium.height} cm")

    println("Volume: ${myAquarium.volume} liters")
    //println("Volume: ${myAquarium.volume()} liters")

    val smallAquarium = Aquarium(length = 20, width = 15, height = 30)
    println("Small Aquarium: ${smallAquarium.volume} Liters")

    val myAquarium2 = Aquarium(numberOfFish = 9)

    println("Small Aquarium 2: ${myAquarium2.volume} Liters with" +
            "length ${myAquarium2.length} " +
            "Width: ${myAquarium2.width} " +
            "Height: ${myAquarium2.height}")
}


fun makeFish(){
    val shark = shark()
    val plecos = plecostome()

    println("Shark: ${shark.color} \n Plecostome: ${plecos.color}")

    shark.eat()
    plecos.eat()

}