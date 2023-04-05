package Lesson5

const val MAJORITY_AGE = 18
fun main(){

    val year = 2023

    println("Введите свой год рождения:")
    val yearOfBirth = readln().toInt()

    if(year - yearOfBirth < MAJORITY_AGE){
        println("Вернуться на главный экран")
    } else {
        println("Показать экран со скрытым контентом")
    }

}