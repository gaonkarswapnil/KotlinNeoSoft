package oops

abstract class User(var username: String, email: String){
    abstract fun login()
}

class Customer(username: String, email: String) : User(username, email) {
    override fun login() {}

    fun shippingAddress(){

    }

    fun placeOrder(){

    }
}

class Admin(username: String, email: String) : User(username, email){
    override fun login() {}

    fun manageProducts(){

    }
}

interface Discountable{
    fun applyDiscount(discountPercent: Double)
}

abstract class Product(var productName: String, price: Double): Discountable{
    abstract fun applyDiscount();
}

class Electronic(productName: String, price: Double, var warrantyPeriod: Double) : Product(productName, price){
    override fun applyDiscount() {
        TODO("Not yet implemented")
    }

    override fun applyDiscount(discountPercent: Double) {
        TODO("Not yet implemented")
    }


}

class Clothing(productName: String, price: Double, var size: Double) : Product(productName, price){

    override fun applyDiscount() {
        TODO("Not yet implemented")
    }

    override fun applyDiscount(discountPercent: Double) {
        TODO("Not yet implemented")
    }


}

class Order(val customer: Customer){
    var products:MutableList<Product> = mutableListOf();

    fun addProduct(product: Product){
        products.add(product);
    }

    fun removeProduct(product: Product){
        products.remove(product);
    }

    fun display(){
        for (product in products){
            println(product)
        }
    }
}

class ShoppingCart{
    private var orders:MutableList<Order> = mutableListOf();

    fun add(order: Order){
        orders.add(order)
    }

    fun remove(order: Order){
        orders.remove(order)
    }

    fun display(order: Order){
        for (c in orders){
            c.display()
        }
    }
}

fun main(){

}