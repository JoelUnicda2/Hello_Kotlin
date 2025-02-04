package Aquarium

class Aquarium( var height: Int = 40,
                var width: Int = 20,
                var length: Int = 100)
{
    var volume: Int
        get() = width * height * length / 1000
        set(value) {height = (value * 1000) / (width * length)}



    var water  = volume   * 0.9

    constructor(numberOfFish: Int) : this() {

    var  water: Int = numberOfFish * 2000 //cm3
    var tank:Double    = water + water * 0.1
        height = (tank / (length * width)).toInt()

    }

    //another way as a funtion
    //fun volume() = width*height*length/1000
}

