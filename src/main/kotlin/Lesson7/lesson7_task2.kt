package Lesson7

fun main() {

    var code = (1000..9999).random()
    println("Your authorization code: $code")
    println("Enter your code:")
    var codeInput = readln().toInt()


    while (codeInput != code) {
        Thread.sleep(2000)

        code = (1000..9999).random()
        println("Your authorization code: $code")
        println("Enter your code again:")
        codeInput = readln().toInt()

    }
    println("Welcome!")
}