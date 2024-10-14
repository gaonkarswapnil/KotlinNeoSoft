package Collection.Practice

data class Employee(
    val id: Int,
    val name: String,
    val age: Int,
    val department: String,
    val position: String,
    val salary: Double,
    val yearsOfExperience: Int,
    val skills: List<String>
)

fun generateEmployees(): List<Employee> {
    return listOf(
        Employee(1, "Alice Johnson", 28, "Finance", "Analyst", 55000.0, 4, listOf("Financial Analysis", "Excel", "Data Visualization")),
        Employee(2, "Bob Smith", 35, "Finance", "Senior Analyst", 72000.0, 10, listOf("Financial Modeling", "Investment Analysis", "Risk Management")),
        Employee(3, "Charlie Brown", 45, "Human Resources", "Manager", 90000.0, 20, listOf("Talent Acquisition", "Employee Relations", "HR Strategy")),
        Employee(4, "Diana Prince", 32, "IT", "Developer", 65000.0, 8, listOf("Java", "Spring Boot", "Database Management")),
        Employee(5, "Evan Thomas", 29, "IT", "Junior Developer", 50000.0, 3, listOf("Python", "HTML/CSS", "JavaScript")),
        Employee(6, "Fiona Adams", 41, "Finance", "Accountant", 78000.0, 18, listOf("Accounting Principles", "Tax Preparation", "Financial Reporting")),
        Employee(7, "George Martin", 38, "Operations", "Operations Manager", 85000.0, 15, listOf("Process Improvement", "Project Management", "Supply Chain Management")),
        Employee(8, "Hannah White", 26, "Marketing", "Marketing Coordinator", 48000.0, 2, listOf("Social Media Marketing", "Content Creation", "SEO")),
        Employee(9, "Ian Black", 50, "IT", "IT Manager", 95000.0, 25, listOf("IT Infrastructure", "Team Management", "Network Security")),
        Employee(10, "Julia Green", 31, "Human Resources", "Recruiter", 58000.0, 6, listOf("Recruitment", "Employee Onboarding", "Interviewing")),
        Employee(11, "Kevin Brown", 37, "Finance", "Financial Advisor", 80000.0, 12, listOf("Investment Strategies", "Client Relations", "Financial Planning")),
        Employee(12, "Laura Scott", 44, "Operations", "Operations Analyst", 67000.0, 19, listOf("Data Analysis", "Operational Efficiency", "Reporting")),
        Employee(13, "Michael Davis", 30, "IT", "System Administrator", 62000.0, 5, listOf("System Maintenance", "Troubleshooting", "Network Administration")),
        Employee(14, "Natalie King", 27, "Finance", "Analyst", 54000.0, 4, listOf("Budget Analysis", "Data Analysis", "Financial Forecasting")),
        Employee(15, "Oliver Clark", 33, "Marketing", "Marketing Specialist", 60000.0, 7, listOf("Market Research", "Campaign Management", "Brand Strategy")),
        Employee(16, "Paula Lewis", 39, "Human Resources", "HR Specialist", 74000.0, 13, listOf("Employee Benefits", "Labor Law", "Conflict Resolution")),
        Employee(17, "Quentin Taylor", 47, "Operations", "Senior Operations Manager", 92000.0, 22, listOf("Strategic Planning", "Team Leadership", "Operational Strategy")),
        Employee(18, "Rachel Harris", 34, "Finance", "Budget Analyst", 68000.0, 9, listOf("Budget Management", "Financial Analysis", "Cost Control")),
        Employee(19, "Steve Wilson", 42, "IT", "Lead Developer", 86000.0, 17, listOf("Software Development", "Code Review", "Architecture Design")),
        Employee(20, "Tina Thompson", 36, "Marketing", "Brand Manager", 73000.0, 11, listOf("Brand Management", "Market Strategy", "Advertising")),
        Employee(21, "Ursula Miller", 29, "Finance", "Credit Analyst", 55000.0, 4, listOf("Credit Risk Assessment", "Financial Reporting", "Data Analysis")),
        Employee(22, "Victor Wright", 40, "Human Resources", "Compensation Specialist", 79000.0, 16, listOf("Compensation Analysis", "Benefits Management", "HR Analytics")),
        Employee(23, "Wendy Baker", 31, "Operations", "Operations Coordinator", 60000.0, 7, listOf("Logistics", "Project Coordination", "Process Optimization")),
        Employee(24, "Xander Collins", 25, "IT", "Junior Developer", 52000.0, 2, listOf("JavaScript", "React", "Front-End Development")),
        Employee(25, "Yvonne Howard", 48, "Finance", "Finance Manager", 93000.0, 24, listOf("Financial Strategy", "Team Management", "Reporting")),
        Employee(26, "Zachary Perez", 28, "Marketing", "Social Media Manager", 57000.0, 4, listOf("Social Media Strategy", "Content Creation", "Analytics")),
        Employee(27, "Amy Young", 35, "Finance", "Risk Analyst", 75000.0, 10, listOf("Risk Assessment", "Financial Modeling", "Investment Analysis")),
        Employee(28, "Brian Foster", 39, "IT", "DevOps Engineer", 80000.0, 14, listOf("CI/CD", "Cloud Services", "Automation")),
        Employee(29, "Catherine Bell", 30, "Human Resources", "HR Coordinator", 58000.0, 6, listOf("HR Operations", "Recruitment", "Employee Engagement")),
        Employee(30, "David Griffin", 46, "Operations", "Logistics Manager", 87000.0, 21, listOf("Logistics Management", "Supply Chain Optimization", "Vendor Management"))
    )
}


//Write a function that returns a list of employees who belong to the "Finance" department.
fun listOfFinanceDept(empData: List<Employee>): List<Employee> {
    return empData.filter { it.department == "Finance" }
}

//Find all employees with more than 10 years of experience.
fun empWithMore10Years(empData: List<Employee>) {
    empData.filter { it.yearsOfExperience > 10 }.forEach { println(it) }
}

//Create a function that filters employees whose salaries fall between 50,000 and 70,000.
fun empSalaryBetween(empData: List<Employee>) {
    empData.filter { it.salary >= 50000 && it.salary <= 70000 }.forEach { println(it) }
}

//Write a function that returns a list of employee names.
fun listOfEmpName(empData: List<Employee>): List<String> {
    return empData.map { it.name }
}

//Create a function that returns a list of unique departments from the employee list.
fun uniqueDepartment(empData: List<Employee>): List<String> {
    return empData.map { it.department }.toSet().toList()
}

//Increase the salary of all employees by 10% and return the updated list.
fun incrementSalary(empData: List<Employee>) {
    empData.map {
        val bonus = it.salary * 0.1;
        it.salary + bonus;
    }.forEach { println(it) }
}

//Sort the employees alphabetically by their names.
fun sortNameAlphabetically(empData: List<Employee>) {
    empData.sortedBy { it.name }.forEach { println(it) }
}

//Sort the employees in descending order of age.
fun sortAgeDec(empData: List<Employee>) {
    empData.sortedByDescending { it.age }.forEach { println(it) }
}


//Sort the employees by their salary, from highest to lowest.
fun sortSalaryDesc(empData: List<Employee>) {
    empData.sortedByDescending { it.salary }.forEach { println(it) }
}


//Group the employees by their department.
fun groupByDepartment(empData: List<Employee>) {
    empData.groupBy { it.department }.forEach { println(it) }
}

//Group employees by their experience level (e.g., 0-5 years, 6-10 years, 11+ years).
fun groupByExp(empData: List<Employee>) {
    empData.groupBy {
        when (it.yearsOfExperience) {
            in 0..5 -> "0-5 years"
            in 6..10 -> "6-10 years"
            else -> "11+ years"
        }
    }.forEach { println(it) }
}

//Calculate the total salary of all employees.
fun totalSalary(empData: List<Employee>) {
    println(empData.sumOf { it.salary })
}

//Compute the average age of employees.
fun averageAge(empData: List<Employee>) {
    println(empData.sumOf { it.age } / empData.size)
    val data = empData.map { it.age }.average()
}

//Find the employee with the highest and lowest salary.
fun highAndLowSalary(empData: List<Employee>) {
    println(empData.maxOfOrNull { it.salary })
    println(empData.minOfOrNull { it.salary })
}

//Partition the employees into two lists: those with more than 10 years of experience and those with 10 years or less.
fun partitonEmp(empData: List<Employee>) {
    val (moreThan10, lessThan10) = empData.partition { it.yearsOfExperience > 10 }
    println(moreThan10)
    println(lessThan10)
}

//Partition the employees into two lists: those earning more than 70,000 and those earning less.
fun partitionEmpOnSalary(empData: List<Employee>) {
    val (moreThan70, lessThan70) = empData.partition { it.salary > 70000 }
    println(moreThan70)
    println(lessThan70)
}


//Assume each employee has a list of skills. Use flatMap to create a list of all skills across all employees.
fun empSkills(empData: List<Employee>) {
    empData.flatMap { it.skills }.forEach { println(it) }
}

//Suppose you have another list of bonus percentages. Zip the list of employees with this bonus list and calculate the new salary for each employee.
fun zipNewSalary(empData: List<Employee>){
    val listOfBonus = listOf(10,20,30,40,50,60);
    val empList = empData.zip(listOfBonus)
    empList.map { (employee, bonus) -> employee.copy(salary = employee.salary+(bonus*100)) }.forEach { println(it) }
}

//Calculate the total years of experience across all employees using fold.
fun totalYearsExp(empData: List<Employee>) {
    println(empData.fold(0) { previous, empExp -> previous + empExp.yearsOfExperience })
}

//Find the employee with the maximum salary using reduce.
fun maxSalaryReduce(empData: List<Employee>) {
    println(empData.map { it.salary }.reduce { previous, max -> if (max > previous) max else previous })
}


//Divide the list of employees into chunks of 5 and return the result.
fun divideListOfEmployee(empData: List<Employee>): List<List<Employee>> {
    return empData.chunked(5)
}

//Create a rolling window of 3 employees and print each window.
fun rollingWindowOfEmployee(empData: List<Employee>) {
    empData.windowed(3).forEach { println(it) }
}

//Create a map of employees keyed by their ID.
fun mapEmployeeByID(empData: List<Employee>) {
    empData.associateBy { it.id }.forEach { println(it) }
}

//Create a map where each key is an employee’s name, and the value is their department.
fun mapEmployeeByNameAndDepartment(empData: List<Employee>) {
    val map = empData.associateBy(keySelector = { it.name }, valueTransform = { it.department })
    map.forEach { println(it) }
}


//Find all unique salary values from the employee list.
fun uniqueSalary(empData: List<Employee>) {
    empData.distinctBy { it.salary }.forEach { println(it) }
}

//Create a list of employees with distinct departments.
fun distinctDepartment(empData: List<Employee>) {
//    empData.map{ it.department }.toSet().forEach { println(it) }
//    empData.distinctBy { it.department }.forEach { println(it) }
    empData.groupBy { it.department }.forEach{ println(it) }
}

//Check if there is any employee in the "IT" department.
fun checkEmployeeFromDepartment(empData: List<Employee>) {
    println(empData.any { it.department == "IT" })
}

//Verify if all employees have a salary greater than 40,000.
fun empSalaryGreaterThan(empData: List<Employee>) {
    println(empData.all { it.salary > 40000 })
}

//Check if none of the employees are under 25 years old.
fun empUnder25(empData: List<Employee>) {
    println(empData.none { it.age > 25 })
}

//Take the first 10 employees from the list.
fun first10Emp(empData: List<Employee>) {
    empData.take(10).forEach { println(it) }
}

//Take employees from the list while their salary is less than 60,000.
fun takeEmployeeBySalary(empData: List<Employee>) {
    empData.takeWhile { it.salary < 60000 }.forEach { println(it) }
}

//Drop the first 5 employees from the list.
fun drop5Emp(empData: List<Employee>) {
    empData.drop(5).forEach { println(it) };
}

//Drop employees from the list while their years of experience are less than 5.
fun dropEmpByExp(empData: List<Employee>) {
//    empData.dropWhile { it.yearsOfExperience < 10 }.forEach { println(it) }
    empData.filter { it.yearsOfExperience < 5 }.forEach { println(it) }
}

//Add a new employee to the existing list of employees.
fun addEmp(empData: List<Employee>, emp: Employee) {
    empData.plus(emp).forEach { println(it) }
}

//Remove an employee from the list based on their ID.
fun removeEmployeeFromList(empData: List<Employee>, data: List<Employee>) {
    empData.minus(data).forEach { println(it) }
}

//Merge two lists of employees, removing duplicates based on ID.
fun mergeEmployee(empList1: List<Employee>, empList2: List<Employee>) {
    empList1.plus(empList2).associateBy { it.id }.values.forEach { println(it) }
}


fun main() {
//    println(listOfFinanceDept(generateEmployees()))
//    empWithMore10Years(generateEmployees())
//    empSalaryBetween(generateEmployees())
//    println(listOfEmpName(generateEmployees()))
//    println(uniqueDepartment(generateEmployees()))
//    incrementSalary(generateEmployees())
//    sortNameAlphabetically(generateEmployees())
//    sortAgeDec(generateEmployees())
//    sortSalaryDesc(generateEmployees())
//    groupByDepartment(generateEmployees())
//    groupByExp(generateEmployees())
//    totalSalary(generateEmployees())
//    averageAge(generateEmployees())
//    highAndLowSalary(generateEmployees())
//    partitonEmp(generateEmployees())
//    partitionEmpOnSalary(generateEmployees())
//    empSkills(generateEmployees())
//    zipNewSalary(generateEmployees())
//    totalYearsExp(generateEmployees())
//    maxSalaryReduce(generateEmployees())
//    divideListOfEmployee(generateEmployees()).forEach{ println(it) }
//    rollingWindowOfEmployee(generateEmployees())
//    mapEmployeeByID(generateEmployees())
//    mapEmployeeByNameAndDepartment(generateEmployees())
//    uniqueSalary(generateEmployees())
    distinctDepartment(generateEmployees())
//    checkEmployeeFromDepartment(generateEmployees())
//    empSalaryGreaterThan(generateEmployees())
//    empUnder25(generateEmployees())
//    first10Emp(generateEmployees())
//    takeEmployeeBySalary(generateEmployees())
//    drop5Emp(generateEmployees())
//    dropEmpByExp(generateEmployees())

//    val emp1 = Employee(100, "Swapnil", 24, "IT", "Developer", 40000.0, 2)
//    addEmp(generateEmployees(), emp1)
//    addEmp(generateEmployees()


    val emp = listOf(
        Employee(1, "Alice Johnson", 28, "Finance", "Analyst", 55000.0, 4, listOf("Financial Analysis", "Excel", "Data Visualization")),
        Employee(2, "Bob Smith", 35, "Finance", "Senior Analyst", 72000.0, 10, listOf("Financial Modeling", "Investment Analysis", "Risk Management")),
        Employee(3, "Charlie Brown", 45, "Human Resources", "Manager", 90000.0, 20, listOf("Talent Acquisition", "Employee Relations", "HR Strategy")),
        Employee(4, "Diana Prince", 32, "IT", "Developer", 65000.0, 8, listOf("Java", "Spring Boot", "Database Management")),
        Employee(5, "Evan Thomas", 29, "IT", "Junior Developer", 50000.0, 3, listOf("Python", "HTML/CSS", "JavaScript")),
        Employee(6, "Fiona Adams", 41, "Finance", "Accountant", 78000.0, 18, listOf("Accounting Principles", "Tax Preparation", "Financial Reporting")),
        Employee(7, "George Martin", 38, "Operations", "Operations Manager", 85000.0, 15, listOf("Process Improvement", "Project Management", "Supply Chain Management")),
        Employee(8, "Hannah White", 26, "Marketing", "Marketing Coordinator", 48000.0, 2, listOf("Social Media Marketing", "Content Creation", "SEO")),
        Employee(9, "Ian Black", 50, "IT", "IT Manager", 95000.0, 25, listOf("IT Infrastructure", "Team Management", "Network Security")),
        Employee(10, "Julia Green", 31, "Human Resources", "Recruiter", 58000.0, 6, listOf("Recruitment", "Employee Onboarding", "Interviewing")),
        )
//    removeEmployeeFromList(generateEmployees(), emp)
    val emp2 = listOf(
        Employee(8, "Swapnil Gaonkar", 26, "Marketing", "Marketing Coordinator", 48000.0, 2,  listOf("Social Media Marketing", "Content Creation", "SEO")),
        Employee(9, "Oliver Queen", 50, "IT", "IT Manager", 95000.0, 25,  listOf("IT Infrastructure", "Team Management", "Network Security")),
        Employee(10, "Julia Green", 31, "Human Resources", "Recruiter", 58000.0, 6, listOf("Recruitment", "Employee Onboarding", "Interviewing")),
        Employee(11, "Kevin Brown", 37, "Finance", "Financial Advisor", 80000.0, 12, listOf("Investment Strategies", "Client Relations", "Financial Planning")),
        Employee(12, "Laura Scott", 44, "Operations", "Operations Analyst", 67000.0, 19, listOf("Data Analysis", "Operational Efficiency", "Reporting")),
        Employee(13, "Michael Davis", 30, "IT", "System Administrator", 62000.0, 5, listOf("System Maintenance", "Troubleshooting", "Network Administration")),
        Employee(14, "Natalie King", 27, "Finance", "Analyst", 54000.0, 4, listOf("Budget Analysis", "Data Analysis", "Financial Forecasting")),
        Employee(15, "Oliver Clark", 33, "Marketing", "Marketing Specialist", 60000.0, 7, listOf("Market Research", "Campaign Management", "Brand Strategy"))
    )
//    mergeEmployee(emp, emp2);

}
