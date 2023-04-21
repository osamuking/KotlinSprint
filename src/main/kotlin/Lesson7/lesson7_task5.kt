package Lesson7

fun main(){
    println("Задайте желаемую длину пароля:")
    val passwordLength = readln().toInt()
    var password = ""
    print("Ваш пароль: ")

    for (i in 1..passwordLength) {
        val x = (1..9).random().toString()
        val y = ('a'..'z').random()
        val z = ('a'..'z').random().uppercaseChar()
        val mergedString = x + y + z
        password += mergedString.random()
    }
    println(password)
}