package Lesson4

fun main() {

    print("Введите день: ")

    val day = readln().toInt()

    /* val isEven = day%2 == 0
    val arms = !isEven
    val abs = !isEven
    val legs = isEven
    val back = isEven */

    val arms = day % 4 == 1
    val abs = day % 4 == 1
    val legs = day % 4 == 3
    val back = day % 4 == 3

    if (!arms && !abs && !legs && !back) {
        println("День отдыха")
    } else if (arms && abs && !legs && !back) {
        println("Упражнения для рук и пресса")
    } else if (!arms && !abs && legs && back) {
        println("Упражнения для ног и спины")
    }
}