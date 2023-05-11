package Lesson10

/*
Для регистрации в приложении пользователь придумывает логин и пароль.
И пароль, и логин должны содержать в себе хотя бы 4 символа.
Если всё верно, программа выводит приветственное сообщение.
– логин и пароль должны считываться с консоли;
– проверку длины логина или пароля вынеси в отдельную функцию, которая валидирует длину пароля;
– если пароль меньше 4 символов – вывести сообщение: "Логин или пароль недостаточно длинные".
 */

fun main() {

    println("Enter your login")
    var log = readln()
    while (checkLength(log) < 4) {
        warning()
        log = readln()
    }

    println("Enter your password")
    var pass = readln()
    while (checkLength(pass) < 4) {
        warning()
        pass = readln()

    }
    println("You have been registered")
}

fun checkLength(x: String): Int {
    val y: List<Char> = x.toList()
     return y.size
}
fun warning() {
    println("You should use at least four symbols")
}