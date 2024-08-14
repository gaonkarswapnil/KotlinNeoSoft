package Constructor

class BankAccount(var accountNumber:String, var balance: Double) {
    constructor(accountNumber: String): this(accountNumber, 0.0)

    val accountSummary: String
        get() = "Account Number: $accountNumber, Balance: $balance"

    fun deposit(amount: Double) {
        balance += amount
    }

    fun withdraw(amount: Double) {
        if(balance < amount) {
            throw IllegalArgumentException("Insufficient funds")
        }
        balance -= amount
    }
}

fun main(args: Array<String>) {
    var bank = BankAccount("123456789", 20.0);
//    println(bank.accountSummary)
    bank.deposit(500.0)
    println(bank.accountSummary)
    bank.withdraw(500.0)
    println(bank.accountSummary)

    bank = BankAccount("987654321");
    bank.deposit(500.0)
    println(bank.accountSummary)
    bank.withdraw(600.0)
    println(bank.accountSummary)
}