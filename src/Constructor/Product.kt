package Constructor

import jdk.jfr.DataAmount

class Product(var name:String, private var price: Double, var quantity:Int) {
    init {
        if (price < 0.0) {
            price = 0.0
            println("Product price is negative so setting it as 0.0")
        }
    }

    constructor(name: String, quantity: Int): this(name, 0.0, quantity)

    public val formattedDetails: String
        get() = "Name: $name, Quantity: $quantity, Price: ${formattedPrice(price)}"

    private fun formattedPrice(price: Double): String {
        return "$${"%.2f".format(price)}"
    }

    public fun updatePrice(newPrice: Double) {
        if(newPrice>0){
            price = newPrice
        }else{
            println("Price must be positive")
        }
    }

    fun restock(amount: Int){
        if(amount > 0){
            quantity+=amount
        }else{
            println("Restock must be positive")
        }
    }

    fun sell(amount: Int){
        if(amount > 0){
            if (amount <= quantity){
                quantity-=amount
            }else{
                println("Insufficient Stocks")
            }
        }else{
            println("Amount must be positive")
        }
    }

}
fun main(args: Array<String>) {
    var product = Product("Oliver",20);
    println(product.formattedDetails)
    product.updatePrice(20.0)
    product.restock(10)
    println(product.formattedDetails);
    product.sell(30);
    println(product.formattedDetails);
    product.sell(-1)
}