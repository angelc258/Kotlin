import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // Prompt user to enter pyramid level
    println("Enter the pyramid level desired: ")
    val pyramidLevel = scanner.nextInt()

    // Print the pyramid
    for (i in 1..pyramidLevel) {
        for (j in 1..i) {
            print("*")
        }
        println() // Move to the next line after printing each level
    }
}