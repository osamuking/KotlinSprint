package Lesson5
const val LOGIN = "Batman"
const val PASSWORD = "password"
fun main() {

    println("Введите свой логин:")
    val input1 = readln()
    if (input1 == LOGIN) {
        println("Введите пароль:")
        val input2 = readln()
        if (input2 == PASSWORD) {
            println("Добро пожаловать!")
        } else {
            println("Неверный пароль")
        }
    } else {println("Пользователь с таким логином не обраружен.\n" +
            "Зарегистрируйтесь на сайте.")}
}
