package Constructor

class Employee(public val name: String, public val id: Int, private var salary: Double) {
    constructor(name: String, id: Int) : this(name, id, 30000.0)

    val formatedDetails: String
        get() = "Name ${name}, Id ${id}, Salary ${formatedSalary(salary)}"

    private fun formatedSalary(salary: Double): String {
        return "$${"%,.2f".format(salary)}";
    }

    public fun giveRaise(amount: Double) {
        if(amount > 0){
            salary += amount
        }
    }

    public fun getSalary(): Double {
        return salary
    }
}

fun main() {
    var emp = Employee("Oliver",123, 20000.0);
    println(emp.formatedDetails)
    emp.giveRaise(1.0)
    println(emp.getSalary())

    emp = Employee("Oliver",123);
    println(emp.formatedDetails)
    emp.giveRaise(-12.0)
    println(emp.getSalary())
}