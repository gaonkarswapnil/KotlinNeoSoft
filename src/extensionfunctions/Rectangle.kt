package extensionfunctions

class Rectangle(private val width: Double, private val height: Double){
    public fun getWidth(): Double{
        return width
    }

    public fun getHeight(): Double{
        return height
    }
}

fun main() {
    var rectangle = Rectangle(10.0, 20.0)
    println(rectangle.area())
}

fun Rectangle.area(): Double{
    return getWidth()*getHeight();
}