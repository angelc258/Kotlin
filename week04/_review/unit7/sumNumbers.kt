// Angel C, Jordan P, Leonardo H
fun main() {
    var sum = 0
    print("Enter a positive nonzero integer: ")
    val number = readLine()?.toIntOrNull()

    if (number != null && number > 0) {
        for (i in 1..number) {
            sum += i
        }
        println("The sum of integers from 1 to $number is: $sum")
    } else {
        println("Please enter a valid positive nonzero integer.")
    }
}
