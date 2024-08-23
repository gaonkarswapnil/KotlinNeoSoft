package typesofclasses.DataClass

data class Product(val name: String, val price: Double, val quantity: Int){
    fun totalPrice(): Double{
        return (price * quantity)
    }
}

fun main() {
    val product = Product("A", 2.0, 3)
    println(product.totalPrice())
}