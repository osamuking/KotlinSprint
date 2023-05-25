package lessons1to10.Lesson10

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

        if (checkResults(humanOneRoundPoints, machineOneRoundPoints))
            humanWinningRounds++

        countRound++

        println("Wanna give it another shot? (y/n)")
    }
    while (startOver(readln()))

    println("Homo Sapience won $humanWinningRounds rounds")

}

fun rollTheDice(): Int {
    val dice1 = Random.nextInt(1, 6)
    val dice2 = Random.nextInt(1, 6)
    println("We have $dice1  and $dice2")
    return dice1 + dice2
}

fun startOver(decision: String): Boolean {
    return decision == "y"
}

fun checkResults(human: Int, machine: Int): Boolean {
    return human > machine
}