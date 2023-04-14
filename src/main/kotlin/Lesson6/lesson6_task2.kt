package Lesson6

fun main() {

    println("Задайте время (сек):")
    val time = readln().toInt()
    var counter = time

    while (counter >= 0) {
        counter--
        Thread.sleep(1000)
    }
    println("Прошло $time секунд")
}