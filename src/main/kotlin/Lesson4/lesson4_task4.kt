package Lesson4

fun main(){

    println("Тренировки проводятся через день. Полный цикл охватывает 11 дней.")
    print("Введите день (от 1 до 11): ")

    val day = readln().toInt()
    val arms = day == 1 || day == 5 || day == 7
    val legs = day == 3 || day == 7 || day ==11
    val back = day == 3 || day == 5 || day ==9
    val abs = day == 1 || day == 9 || day == 11

    if(day%2 == 0) {
        println("Сегодня день отдыха")
    } else {
        println(
            """Упражнения для рук:    $arms
        |Упражнения для ног:    $legs
        |Упражнения для спины:  $back
        |Упражнения для пресса: $abs
    """.trimMargin()
        )
    }
}