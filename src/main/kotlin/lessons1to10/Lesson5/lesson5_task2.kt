package lessons1to10.Lesson5

const val MAJORITY_AGE = 18
fun main() {

    val year = 2023

    print("Введите свой год рождения: ")
    val yearOfBirth = readln().toInt()

    if (year - yearOfBirth < MAJORITY_AGE) {
        println("\nВернуться на главный экран")
    } else {
        println("\nПоказать экран со скрытым контентом")
    }
}