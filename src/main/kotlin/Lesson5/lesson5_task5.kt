package Lesson5
//Угадываем рандомные числа

fun main() {
  
    val number1 = (1..100).random()
    val number2 = (1..100).random()
    var counter = 3
    println(
        "Угадайте два числа от 1 до 100 и получите главный приз!\n" +
                "За одно угаданное число вы получите утешительный приз."
    )
    while (counter > 0) {
        when (counter) {
            1 -> {println("(У вас осталась $counter попытка)\nВведите первое число:")
            }
            3 -> {println("(У вас есть $counter попытки)\nВведите первое число:")
            }
            else -> println("(У вас осталось $counter попытки)\nВведите первое число:")
        }
        val input1 = readln().toInt()
        println("Введите второе число:")
        val input2 = readln().toInt()
        if ((input1 != input2) && ((input1 == number1 || input1 == number2) &&
                    (input2 == number1 || input2 == number2))
        ) {
            println("Поздравляем! Вы выиграли главный приз!")
            break
        } else if ((input1 == number1 || input1 == number2) ||
            (input2 == number1 || input2 == number2)
        ) {
            println("Вы выиграли утешительный приз.\nПравильные номера: $number1 и $number2")
            break
        }
        counter--
        if (counter == 0) {
            println("Игра окончена. Правильные номера: $number1 и $number2")
            break
        }
        println("Неудача! Попробуйте еще раз.")

    }