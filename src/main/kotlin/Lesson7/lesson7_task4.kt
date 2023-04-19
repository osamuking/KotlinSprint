package Lesson7

fun main() {
    print("Enter the time: ")
    val time = readln().toInt()

    for (i in time - 1 downTo 0) {
        Thread.sleep(1000)
        /*if (i == 0)
            break*/
        println(i)
    }
    print("Time is over")
}