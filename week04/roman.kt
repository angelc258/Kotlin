fun main(args: Array<String>) {
    print("Enter a number between 1 and 10.")

    var number = readLine()!!
    println("You entered " + number.toInt())
    var ram = number.toInt()

    if (ram == 1) {
        println("The roman numeral is 1.")
    }
}
    
    //If the number is less than 1 or higher than the print ERROR
    //If the number is 1 then print I
    //If the number is 2 then print II
    //If the number is 3 then print III
    //If the number is 4 then print IV
    //If the number is 5 then print V
    //If the number is 6 then print VI
    //If the number is 7 then print VII
    //If the number is 8 then print VIII
    //If the number is 9 then print IX
    //If the number is 10 then print X