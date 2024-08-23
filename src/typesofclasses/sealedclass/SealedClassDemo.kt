package typesofclasses.sealedclass

// the subclass should be created within the same file where the sealed class itself is defined
// With the sealed class we can have regular class and data class as well and object(static) declaration as well
// Sealed class ensures type-safety by restricting the set of types at compile time only
// A sealed class is by default an abstract class which cannot instantiated
// By default constructor of sealed class is private and we cannot make it as non-private

sealed class Shape {
    class Circle(val radius: Double) : Shape()
    class Square(val size: Int) : Shape()
    object NoShape : Shape()
}

class Rectangle(val width: Double, val height: Double) : Shape()

fun main() {
    val circle = Shape.Circle(10.0);
    val square = Shape.Square(1)
    val rectangle = Rectangle(10.0, 5.0);
    val noSquare = Shape.NoShape

    area(noSquare);
}

fun area(shape: Shape) {
    when (shape) {
        is Shape.Circle -> println("Area of Circle is ${3.14 * shape.radius * shape.radius}")
        is Rectangle -> println("Area of Rectangle is ${shape.width * shape.height}")
        is Shape.Square -> println("Area of Square's Square is ${shape.size * shape.size}")
        Shape.NoShape -> println("NO shape")
    }
}

