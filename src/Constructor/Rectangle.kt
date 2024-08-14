package Constructor

class Rectangle(var width: Double, var height: Double) {
    val area: Double
        get() = width*height

    val perimeter: Double
        get() = (2*(width+height))

    fun isSquare(): Boolean {
        return width == height
    }
}

fun main(){
    var rectangle = Rectangle(10.0, 10.0)
    println(rectangle.area)
    println(rectangle.perimeter)
    println(rectangle.isSquare())
}