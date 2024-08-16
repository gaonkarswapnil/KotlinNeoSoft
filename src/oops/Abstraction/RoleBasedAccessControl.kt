package oops.Abstraction

abstract class User(protected var username: String, protected var password: String) {
    abstract var isAuthorized: Boolean;
    abstract fun login(username: String, password: String): Boolean
    abstract fun getPermission(): String
}

class Admin(username: String, password: String) : User(username, password){
    override var isAuthorized: Boolean = false

    override fun login(username: String, password: String): Boolean {
        if(this.username == username && this.password == password){
            isAuthorized = true
            return true
        }
        return false
    }

    override fun getPermission(): String {
        if(isAuthorized){
            return "Permission of ADMIN (READ, WRITE, DELETE, UPDATE)"
        }
        return "Access Denied"
    }
}

class Manager(username: String, password: String) : User(username, password) {
    override var isAuthorized: Boolean = false

    override fun login(username: String, password: String): Boolean {
        if(this.username== username && this.password == password){
            isAuthorized = true
            return true
        }
        return false
    }

    override fun getPermission(): String {
        if(isAuthorized){
            return "Permission of MANAGER (READ, WRITE, DELETE)"
        }
        return "Access Denied"
    }
}

class Employees(username: String, password: String) : User(username, password) {
    override var isAuthorized: Boolean = false

    override fun login(username: String, password: String): Boolean {
        if(this.username== username && this.password == password){
            isAuthorized = true
            return true
        }
        return false
    }

    override fun getPermission(): String {
        if(isAuthorized){
            return "Permission of EMPLOYEE (READ, WRITE)"
        }
        return "Access Denied"
    }
}

fun main(){
    val admin = Admin("admin", "admin")
    admin.login("admin", "admin")
    println(admin.getPermission());

    val manager = Manager("manager", "manager")
    manager.login("manager", "manager")
    println(manager.getPermission())

    val employee = Employees("employee", "employee")
    employee.login("admin", "admin")
    println(employee.getPermission());
}