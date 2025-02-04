package Aquarium

fun main (args: Array<String>){
    buildaquarium()
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
}