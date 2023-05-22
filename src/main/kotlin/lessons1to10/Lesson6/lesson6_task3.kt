package lessons1to10.Lesson6

fun main() {

    println("Задайте время (сек):")
    val time = readln().toInt()
    var counter = time

    while (counter > 0) {
            println("Осталось секунд: $counter")
            counter--
            Thread.sleep(1000)
        }
    println("Время вышло")
}