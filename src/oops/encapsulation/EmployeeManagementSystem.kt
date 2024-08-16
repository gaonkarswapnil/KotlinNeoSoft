package oops.encapsulation

import jdk.jfr.DataAmount

class Employee(private val id: Int, private val name: String) {
    private var salary: Double = 0.0
//        get() {
//            return field
//        }
//        set(value){
//            if(value > 0){
//                field = value
//            }
//        }

    fun getName(): String {
        return name
    }

    fun getId(): Int {
        return id
    }

    fun setSalary(amount: Double) {
        if (amount > 0) {
            salary = amount;
        } else {
            println("Salary should be positive");
        }
    }

    fun giveRaise(percentage: Double) {
        if (percentage > 0) {
            salary += salary * (percentage / 100);
        } else {
            println("Percentage should be positive");
        }
    }

    fun display() {
        println("Name: ${getName()}, ID: ${getId()}, salary: ${salary}")
    }

    fun getAnnualSalary(): Double {
        return salary * 12;
    }
}

class Department {
    var employees: MutableList<Employee> = mutableListOf()

    fun addEmp(emp: Employee) {
        employees.add(emp)
    }

    fun removeEmp(id: Int) {
        var employee = employees.find { it.getId() == id }
        if (employee != null) {
            employees.remove(employee)
        }else{
            println("ERROR 404 Employee with $id Not Found")
        }
    }

    fun display() {
        if (employees.isEmpty()) {
            println("ERROR 404 Employees Not Found")
        } else {
            employees.forEach { it -> it.display() }
        }
    }
}

fun main(args: Array<String>) {
    var emp1 = Employee(1, "Oliver")
    var emp2 = Employee(2, "Author")
    var emp3 = Employee(3,"Micheal")

    emp1.setSalary(123.0);
    emp2.setSalary(456.0);
    emp3.setSalary(789.0);

    emp1.giveRaise(10.0);
    emp2.giveRaise(20.0);
    emp3.giveRaise(30.0);

//    emp1.display()
//    emp2.display()
//    emp3.display()

    val department = Department();
    department.addEmp(emp1)
    department.addEmp(emp2)
    department.addEmp(emp3)

    department.display()

    department.removeEmp(9)

    println("After removal ")
    department.display()
}