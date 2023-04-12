package Lesson6

import kotlin.system.exitProcess

//Регистрация и проверка только пароля

fun main(){
    var counter1 = 3

    println("Если хотите зарегистрироваться, то придумайте логин и пароль.\nВаш будущий логин:")
    val newLogin = readln()
    println("Ваш будущий пароль:")
    val newPassword = readln()
    println("Для того, чтобы пользоваться сервисом, нужно ввести ваш логин и пароль.\nВаш пароль: ($counter1):")
    while (counter1 > 0) {
        if (readln() == newPassword) {
            println("Авторизация прошла успешно")
            exitProcess(0)
        } else if(counter1 == 1) {
            break
        } else {
            counter1--
            println("Попробуйте еще раз ($counter1):")
        }
    }
    println("Пройдите процедуру регистрации заново")
}