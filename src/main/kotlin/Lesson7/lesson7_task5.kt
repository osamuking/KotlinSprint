package Lesson7

fun main(){
    println("Задайте желаемую длину пароля:")
    val passwordLength = readln().toInt()
    var password = ""
    print("Ваш пароль: ")
    for (i in 1..passwordLength) {
    var data = (('a'..'z') + ('A'..'Z') + (1..9)).random().toString()
        password += data
    }
    println(password)

}