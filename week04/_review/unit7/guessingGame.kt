import kotlin.random.Random

fun main() {
    val randomNumber = Random.nextInt(1, 101) // Generates a random number between 1 and 100
    var guess: Int?

    println("Guess the number between 1 and 100.")

    do {
        print("Enter your guess: ")
        guess = readLine()?.toIntOrNull()

        if (guess != null) {
            if (guess < randomNumber) {
                println("Too low, try again.")
            } else if (guess > randomNumber) {
                println("Too high, try again.")
            } else {
                println("Congratulations! You guessed the correct number: $randomNumber")
            }
        } else {
            println("Please enter a valid number.")
        }
    } while (guess != randomNumber)
}