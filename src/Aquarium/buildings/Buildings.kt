package Aquarium.buildings


open class BaseBuildingMaterial {
    open val numberNeeded: Int = 1
}

class Wood : BaseBuildingMaterial() {
    override val numberNeeded = 4
}

class Brick : BaseBuildingMaterial() {
    override val numberNeeded = 8
}


class Building<T : BaseBuildingMaterial>(private val material: T) {

    private val baseMaterialsNeeded: Int = 100

    val actualMaterialsNeeded: Int
        get() = baseMaterialsNeeded * material.numberNeeded


    fun build() {
        println("${actualMaterialsNeeded} ${material::class.simpleName} required")
    }
}



fun <T : BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
    if (building.actualMaterialsNeeded < 500) println("Small building")
    else println("large building")
}




fun main() {

    isSmallBuilding(Building(Brick()))
    val woodBuilding = Building(Wood())
    woodBuilding.build()


    val brickBuilding = Building(Brick())
    brickBuilding.build()
}


