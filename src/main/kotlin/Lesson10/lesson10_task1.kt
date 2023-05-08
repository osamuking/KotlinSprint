package Lesson10

/*
Напиши небольшую игру, в которой пользователь и компьютер по очереди
бросают кости. Побеждает выбросивший наибольшее число.
 – поочередно выводи сообщение о ходе игрока и компьютера (отображать
 кто бросил, какие значения на кубиках);
 – бросок костей вынеси в отдельную функцию, в которой генерируются
 2 случайных числа от 1 до 6;
 – в отдельные переменные сохрани результат работы функции для игрока
 и компьютера;
 – после сравнения результатов, выведи соответствующее сообщение в консоль.
 Например: "Победило человечество" или "Победила машина".
 */
fun main() {

    print("Human's turn. Roll the dice!")
    readln()
    val human = rollDice()
    println("Homo Sapience has got $human ${grammar(human)}\n")
    print("Super computer's turn. Roll the dice!")
    readln()
    val machine = rollDice()
    println("Super computer has got $machine ${grammar(machine)}\n")
    if (human > machine)
        println("The winner is Homo Sapience!")
    else if (human < machine)

        println("The winner is Super computer!")
    else
        println("We have a tie score.")

}

fun rollDice(): Int {
    return (1..6).random()
}

fun grammar(a: Int): String {
    return if (a == 1)
        "point"
    else
        "points"
}
