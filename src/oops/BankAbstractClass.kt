package oops

abstract class BankAccount(val accountName: String, var balance: Double) {
    fun validate(amount: Double): Boolean {
        if (amount <= 0.0) {
            throw IllegalArgumentException("Amount must be greater than zero")
        }
        return true
    }

    abstract fun deposit(amount: Double)

    abstract fun withdraw(amount: Double)

    fun viewBalance(): Double{
        return balance;
    }

    abstract fun calculateRateOfInterest()
}

class SavingsAccount(accountName: String, balance: Double) : BankAccount(accountName, balance) {

    override fun deposit(amount: Double) {
        if (validate(amount)) {
            balance += amount
            println("Deposited $$amount to Savings Account. New balance: $$balance")
        }
    }

    override fun withdraw(amount: Double) {
        if (validate(amount)) {
            if (amount <= balance) {
                balance -= amount
                println("Withdrew $$amount from Savings Account. New balance: $$balance")
            } else {
                println("Insufficient funds in Savings Account for withdrawal of $$amount")
            }
        }
    }

    override fun calculateRateOfInterest() {
        println("${viewBalance() * 10/100}")
    }
}

class CurrentAccount(accountName: String, balance: Double) : BankAccount(accountName, balance) {

    override fun deposit(amount: Double) {
        if (validate(amount)) {
            balance += amount
            println("Deposited $$amount to Current Account. New balance: $balance")
        }
    }

    override fun withdraw(amount: Double) {
        if (validate(amount)) {
            if (amount <= balance) {
                balance -= amount
                println("Withdrew $$amount from Current Account. New balance: $balance")
            } else {
                println("Insufficient funds in Current Account for withdrawal of $amount")
            }
        }
    }

    override fun calculateRateOfInterest() {
        println("${viewBalance() * 3/100}")
    }

}

class Service {
    fun manage(account: BankAccount, task: String, amount: Double=0.0) {
        when (task.lowercase()) {
            "deposit" -> account.deposit(amount)
            "withdraw" -> account.withdraw(amount)
            "balance" -> println("Current balance: ${account.viewBalance()}")
            "calculateinterest" -> account.calculateRateOfInterest()
            else -> println("Invalid action")
        }
    }
}

fun main() {
    val service = Service()

    val savingsAccount: BankAccount = SavingsAccount("Alice", 5000.00)
    service.manage(savingsAccount, "deposit", 200.00)
    service.manage(savingsAccount, "withdraw", 50.00)
    service.manage(savingsAccount, "calculateInterest")
//    service.manage(savingsAccount, "balance", 0.0)

//    val currentAccount: BankAccount = CurrentAccount("Bob", 1000.00)
//    service.manage(currentAccount, "deposit", 300.00)
//    service.manage(currentAccount, "withdraw", 100.00)
//    service.manage(currentAccount, "balance", 0.0)
}
