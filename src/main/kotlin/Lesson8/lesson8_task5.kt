package Lesson8

/* Задача 5 к Уроку 8
Напиши программу, которая должна создавать массив из определенного количества ингредиентов,
которые будет вводить пользователь. Элементы вводятся по одному.
Перед вводом элементов сначала запрашивается количество планируемых ингредиентов.
 */
fun main() {

    var ingredientsArray = emptyArray<String>()
    var i = 0

    println("Enter the amount of ingredients:")
    val number = readln().toInt()

    while (i < number) {
        when (i) {
            0 -> println("Enter the first ingredient:")
            number - 1 -> println("Enter the last ingredient:")
            else -> println("Enter the next ingredient:")
        }
        ingredientsArray += readln()
        i++
    }
    println("List of ingredients:")
    for (i in ingredientsArray)
        println(i)

}
