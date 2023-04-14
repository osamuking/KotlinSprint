package Lesson6

fun main() {

    val number = (1..9).random()
    var counter = 5

    println("Угадайте число от 1 до 9. Количество попыток: $counter")

    while (counter > 0) {
        if (readln().toInt() == number) {
            println("Это была великолепная игра!")
            break
        } else {
                counter--
            if (counter == 0) {
                println("Было загадано число $number")
                break
            }
                println("Попробуйте еще раз. Осталось попыток: $counter")
            }
        }
    }