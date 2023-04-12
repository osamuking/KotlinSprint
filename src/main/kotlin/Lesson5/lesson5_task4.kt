package Lesson5
const val LOGIN = "Batman"
const val PASSWORD = "password"
fun main() {

    println("Введите свой логин:")

    if (readln() == LOGIN) {
        println("Введите пароль:")

        if (readln() == PASSWORD) {
            println("Добро пожаловать!")
        } else {
            println("Ошибка авторизации")
        }

    } else {println("Пользователь с таким логином не обраружен.\n" +
                            "Зарегистрируйтесь на сайте.")}

}
