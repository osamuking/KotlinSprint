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

fun main() {
    println("Start the game")
    startOver()
}

fun rollTheDice(): Int {
    val a = (1..6).random()
    val b = (1..6).random()
    return a + b
}

fun startOver() {
    var humanTotalPoints = 0
    var machineTotalPoints = 0
    var roundCount = 1
    var humanWinningRounds = 0
    var machineWinningRounds = 0

    while (true) {
        var humanOneRoundPoints = 0
        var machineOneRoundPoints = 0
        println("Round $roundCount")
        print("Human's turn. Roll the dice!")
        readln()
        humanOneRoundPoints += rollTheDice()
        humanTotalPoints += humanOneRoundPoints
        println("Homo Sapience got $humanOneRoundPoints ${setGrammar(humanOneRoundPoints)}")

        print("Machine's turn. Roll the dice!")
        readln()
        machineOneRoundPoints += rollTheDice()
        machineTotalPoints += machineOneRoundPoints
        println("Super Computer got $machineOneRoundPoints ${setGrammar(machineOneRoundPoints)}")

        if (humanOneRoundPoints > machineOneRoundPoints)
            humanWinningRounds++
        else if (humanOneRoundPoints < machineOneRoundPoints)
            machineWinningRounds++

        println("\nWanna give it another shot? (y/n)")

        when (readln()) {
            "y" -> {
                roundCount++
                continue
            }

            "n" -> {
                if (humanWinningRounds < machineWinningRounds)
                    println("Game's over. Winner - Super Computer. It won $machineWinningRounds rounds and got " +
                                    "$machineTotalPoints points")
                else if (humanWinningRounds > machineWinningRounds)
                    println("Game's over. Winner - Homo Sapience. He won $humanWinningRounds rounds and got " +
                                    "$humanTotalPoints points")
            }
            else -> {println("Tie score")}
        }
        break
    }
}

fun setGrammar(a: Int): String {

    return if (a == 1)
        "point"
    else
        "points"
}