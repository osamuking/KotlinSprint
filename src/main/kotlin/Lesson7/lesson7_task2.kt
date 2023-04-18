package Lesson7

fun main() {

    do {
        var code = (1000..9999).random()
        println("Your authorization code: $code")
        println("Enter your code:")
        var codeInput = readln().toInt()
    }
    while (codeInput != code)

    println("Welcome!")
}