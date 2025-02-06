package Aquarium.Decorations

fun main (){
    // Creating some containers with spices
    val container1 = SpiceContainer("Cinnamon")
    val container2 = SpiceContainer("Paprika")
    val container3 = SpiceContainer("Turmeric")

    // Printing out their labels
    println(container1.label)  // Output: Container of Cinnamon
    println(container2.label)  // Output: Container of Paprika
    println(container3.label)  // Output: Container of Turmeric
    makeDecorations()

}

fun makeDecorations(){
    val d1 = Decorations ("Granito")
    println(d1)
    val  d2 = Decorations("Slavi")
    println(d2)
    val d3 = Decorations("Marmol")
    println(d3)

    println(d1.equals(d2))

}

data class Decorations(val rocks: String){}

data class SpiceContainer(val spiceName: String) {
    val label: String
        get() = "Container of $spiceName"
}

