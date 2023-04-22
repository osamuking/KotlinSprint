package Lesson8

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

    println(weeklyViews[0] + weeklyViews[1] + weeklyViews[2] + weeklyViews[3] + weeklyViews[4] + weeklyViews[5] +
    weeklyViews[6])
    }
    */
//---------------------------------------------------------------------------------------
// Или так:

/* fun main() {
    var mon = 0
    var tue = 0
    var wed = 0
    var thu = 0
    var fri = 0
    var sat = 0
    var sun = 0

    val weeklyView = arrayOf(mon, tue, wed, thu, fri, sat, sun)

    mon = 3
    tue = 44
    wed = 55
    thu = 666
    fri = 579
    sat = 1234
    sun = 5678


    println("\nКоличество просмотров за неделю составило ${mon + tue + wed + thu + fri + sat + sun}")
}
*/
//----------------------------------------------------------------------------------------
// Или так:
fun main() {

    val weeklyView = arrayOf(0, 0, 0, 0, 0, 0, 0)

    weeklyView[0] = 3
    weeklyView[1] = 44
    weeklyView[2] = 55
    weeklyView[3] = 666
    weeklyView[4] = 579
    weeklyView[5] = 1234
    weeklyView[6] = 5678


    println("\nКоличество просмотров за неделю составило ${weeklyView[0] + weeklyView[1] + weeklyView[3] +
            weeklyView[4] + weeklyView[5] + weeklyView[6]}")
}
