package Lesson6

fun main(){

    println("Задайте время в секундах:")
    val time = readln().toInt()
    var counter = time

    while (counter > 0) {
       // println(counter)
        counter--
        Thread.sleep(1000)
    }
    println("Прошло $time секунд")
}