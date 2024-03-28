class BankAccount(
    val accountNumber: String,
    var balance: Double,
    val ownerName: String
) {
    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("$amount deposited successfully. New Balance: $balance")
        } else {
            println("Invalid deposit amount. Account must be greater than zero.")
        }
    }
}

fun main () {

    val myAccount = BankAccount("123456789", 1000.0, "Angel C")


    myAccount.deposit(500.0) // Depositing 500.0
}