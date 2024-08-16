package oops.encapsulation

class BankAccount(private var accountNumber: String, private var accountHolder: String, private var balance: Double) {
    fun getAccountNumber(): String {
        return accountNumber;
    }

    fun getAccountHolder(): String {
        return accountHolder;
    }

    fun getBalance(): Double {
        return balance;
    }

    fun deposit(amount: Int) {
        if (amount > 0) {
            balance += amount
        } else {
            println("Amount should be positive")
        }
    }

    fun withdraw(amount: Int) {
        if (amount > balance) {
            println("Amount should be greater than balance")
        } else {
            balance -= amount
        }
    }

    fun transfer(amount: Int, toAccount: BankAccount) {
        if (amount > balance) {
            println("Insufficient FUNDS")
        } else {
            toAccount.deposit(amount);
            balance -= amount;
        }
    }

    fun printDetails() {
        println("Account: ${getAccountNumber()} - Name: ${getAccountHolder()} - Balance: ${getBalance()}")
    }

    fun calculateInterest(interest: Double) {
        if (interest > 0) {
            balance += balance * (interest / 100)
        } else {
            println("Interest should be greater than zer0")
        }
    }
}

class Bank {
    var accounts: MutableList<BankAccount> = mutableListOf()

    fun addAccount(account: BankAccount) {
        accounts.add(account)
    }

    fun removeAccount(accountNo: String) {
        val accountNumber = accounts.find { it.getAccountNumber() == accountNo }
        if (accountNumber != null) {
            accounts.remove(accountNumber)
        } else {
            println("404 Bank Account not found")
        }
    }

    fun displayAllAccounts(){
        accounts.forEach { it-> it.printDetails() }
    }
}

fun main() {
    val bank1 = BankAccount("123","Oliver", 500.0)
    val bank2 = BankAccount("456","Tokyo", 50.0)

    bank1.transfer(200, bank2);
//
//    bank1.printDetails();
//    bank2.printDetails()

    val bank = Bank();
    bank.addAccount(bank1)
    bank.addAccount(bank2)
    bank.displayAllAccounts()

    bank2.transfer(250, bank1);
    bank.displayAllAccounts()

    println("After removing ")
    bank.removeAccount("456")
    bank.displayAllAccounts()
}