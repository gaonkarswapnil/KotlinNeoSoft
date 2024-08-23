package typesofclasses.singleton

open class SuperClass(){
    var msg: String = "Hello"

    open fun method(msg: String){
        println("$msg from SuperClass")
    }
}

object Customer: SuperClass(){
    var id = -1
    fun customerType(): String{
        return "Indian"
    }

    override fun method(msg: String) {
        super.method(msg)
        println("$msg from Object")
    }
}
fun main() {
    Customer.id = 100;
    println(Customer.id)
    Customer.id = 103;
    println(Customer.id)

    println(Customer.customerType())

    println(Customer.id)

    Customer.method("Data")

}