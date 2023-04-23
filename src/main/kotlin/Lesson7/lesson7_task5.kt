package Lesson7

fun main() {
    var password = ""
    val x = 'a'..'z'
    val y = 'A'..'Z'
    val z = 1..9
    val data = z + x + y

    println("Задайте желаемую длину пароля:")
    val passwordLength = readln().toInt()
    print("Ваш пароль: ")

    for (i in 1..passwordLength) {
        password += data.random()
    }
    println(password)
}