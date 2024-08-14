package Constructor

class Car (make:String, model:String, year: Int){
    var make = make;
    var model = model;
    var year = year;

    constructor(make: String, model:String) : this(make, model, 2005)

    fun fullDetails(): String{
        return "Made by ${make}, Model: $model, year: $year"
    }
}

fun main(args: Array<String>) {
    var car = Car("Tesla", "Model X")
    println( car.fullDetails())
    car = Car("Tesla", "Model Y", 2009)
    println( car.fullDetails() )
}