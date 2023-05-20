package Lesson10

/*
Усовершенствуй игру, где пользователь и компьютер по очереди бросают кости.
Побеждает выбросивший наибольшее число. Теперь дай возможность пользователю
играть до тех пор пока ему не надоест. В конце программа должна вывести сколько партий он выиграл.

 – логика бросков должна быть реализована по примеру из задачи 1;
 – после первого раунда программа задает вопрос: “Хотите бросить кости еще раз Введите Да или Нет”;
 – программа в зависимости от ответа запускает новый раунд или заканчивает игру с выводом
 количества выйгрышных партий человека;
 – в программе должно быть минимум 2 метода (для проведения раунда и для генерации значений кубиков)
 */

import kotlin.random.Random

fun main() {
    var countRound = 1
    var humanTotalPoints = 0
    var machineTotalPoints = 0
    var humanWinningRounds = 0
//    var machineWinningRounds = 0

    println("\nWe start the game. To kick a round off hit the Enter key.")
    do {
        print("Round $countRound. Human's turn. Roll the dice!")
        readln()
        val humanOneRoundPoints = rollTheDice()
        println("Homo Sapience got $humanOneRoundPoints points\n")
        humanTotalPoints += humanOneRoundPoints

        print("Super computer's turn. Roll the dice!")
        readln()
        val machineOneRoundPoints = rollTheDice()
        println("Super computer got $machineOneRoundPoints points\n")
        machineTotalPoints += machineOneRoundPoints

        if (humanOneRoundPoints > machineOneRoundPoints)
            humanWinningRounds++

//         else if (humanOneRoundPoints < machineOneRoundPoints)
//            machineWinningRounds++
//         else
//            println("We have a tie score.")

        countRound++

        println("Wanna give it another shot? (y/n)")
    }
    while (startOver(readln()))

    println("Homo Sapience won $humanWinningRounds rounds")

}

fun rollTheDice(): Int {
    val a = Random.nextInt(1, 6)
    val b = Random.nextInt(1, 6)
    println("We have $a  and $b")
    return a + b
}

fun startOver(x: String): Boolean {
    return x == "y"
}