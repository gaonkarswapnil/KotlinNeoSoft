package oops.Abstraction

import javax.print.attribute.standard.JobPriority

abstract class Employee(protected val name:String) {
    abstract fun calaulateSalary(): Double
}

class FullTimeEmploee(name: String, private var annualSalary:Double) : Employee(name) {
    override fun calaulateSalary(): Double {
        return annualSalary /12;
    }
}

class PartialTimeEmploee(name: String, private var hourlyWages: Double, private var hourWorked: Double): Employee(name) {
    override fun calaulateSalary(): Double {
        return hourlyWages*hourWorked;
    }
}

class ContractEmployee(name: String, private var ratePerProject: Double, private var projectCompleted: Double) : Employee(name) {
    override fun calaulateSalary(): Double {
        return ratePerProject*projectCompleted;
    }
}

fun main(args: Array<String>) {
    val fullTimeEmploee = FullTimeEmploee("Swapnil", 10000.0);
    val partTimeEmploee = PartialTimeEmploee("Oliver", 150.0, 5.5);
    val contractEmployee = ContractEmployee("Author", 100.0, 45.4)

    println( fullTimeEmploee.calaulateSalary())

    println( partTimeEmploee.calaulateSalary())
    println( contractEmployee.calaulateSalary())
}