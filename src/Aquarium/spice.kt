package Aquarium

class spice  {
    class SimpleSpice(){
        val name = "curry"
        val spiciness = "mild"
        val heat: Int
            get() {return 5 }
    }

    val simpleSpice = SimpleSpice()
    init {
        println("${simpleSpice.name} ${simpleSpice.heat}")
    }

}