package lessons1to10.Lesson5
//Угадываем два числа

fun main() {

    val number1 = 44
    val number2 = 72
    var counter = 3

    println(
        "Угадайте два числа от 1 до 100 и получите главный приз!\n" +
                "За одно угаданное число вы получите утешительный приз"
    )

    while (counter > 0) {
        if (counter == 1) {
            println("У вас осталась $counter попытка.\nВведите первое число:")
        } else if (counter == 3) {
            println("У вас есть $counter попытки")
        } else
            println("У вас осталось $counter попытки")
        val input1 = readln().toInt()
        println("Введите второе число:")
        val input2 = readln().toInt()

        if ((input1 != input2) && ((input1 == number1 || input1 == number2) &&
                    (input2 == number1 || input2 == number2)))
        {
            println("Поздравляем! Вы выиграли главный приз!")
            break
        } else if ((input1 == number1 || input1 == number2) ||
            (input2 == number1 || input2 == number2))
        {
            println("Вы выиграли утешительный приз.")
            break
        }
        counter--
        if (counter == 0) {
            println("Игра окончена. Правильные номера: 44 и 72")
            break
        }
        println("Неудача! Попробуйте еще раз")
    }

}
