package Lesson6

fun main(){

    var counter = 3

    while (counter > 0) {
        var number1 = (1..9).random()
        var number2 = (1..9).random()
        print("Решите пример (у вас есть 3 попытки): $number1 + $number2 = ")
        if ((number1 + number2) == readln().toInt()) {
            println("Добро пожаловать!")
            break
        } else if (counter == 1) {
            println("Доступ запрещен")
            break
        } else {
            counter--
            println("Неверно. Осталось попыток: $counter")
        }
    }
}