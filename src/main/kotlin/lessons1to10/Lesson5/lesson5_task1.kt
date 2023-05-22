package lessons1to10.Lesson5

fun main() {
    print("Подтвердите, что вы - человек, решите пример: 37 - 12 = ")
    val input = readln().toInt()

    val result = 25

    if (input == result)
        println("\nДобро пожаловать!")
    else
        println("\nДоступ запрещен")

}