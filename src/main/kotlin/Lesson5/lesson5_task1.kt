package Lesson5

lesson5-task1
fun main(){

    print("\nПодтвердите, что вы человек, решите пример: 37 - 12 = ")
    val input = readln().toInt()
    val result = 25

    if(input == result)
        println("\nДобро пожаловать!")
    else
        println("\nДоступ запрещен")

}