package lessons1to10.Lesson8

/* Задача 1 к Уроку 8

Скрипт считает количество просмотров рекламы за день.
Напиши программу, которая сохраняет в массив данные
просмотров за неделю (числа использовать на свое усмотрение).
Каждая ячейка хранит количество просмотров за день.
Имея массив с данными, нужно посчитать сколько всего
было просмотров за неделю. Результат вычислений выведи в консоль.
*/
//======================================================================================
/* Можно сделать так:

fun main(){

    val weeklyViews = arrayOf(1, 22, 33, 44, 579, 1234, 5678)
    val sum = 0

    for (i in weeklyView.indices)
        sum += weeklyView[i]

    println("\nКоличество просмотров за неделю составило $sum")
    }
    */
//----------------------------------------------------------------------------------------

// Или так:
fun main() {

    val weeklyView = Array(7){0}
    var sum = 0

    weeklyView[0] = 1
    weeklyView[1] = 22
    weeklyView[2] = 333
    weeklyView[3] = 4444
    weeklyView[4] = 55555
    weeklyView[5] = 666666
    weeklyView[6] = 7777777

    for (i in weeklyView.indices)
        sum += weeklyView[i]

    println("\nКоличество просмотров за неделю составило $sum")

}
