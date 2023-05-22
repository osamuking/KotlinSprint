package lessons1to10.Lesson8

/* Задача 3 к Уроку 8

Скопируй предыдущее задание. Нужно изменить код, чтобы проверить, есть ли ингредиент в рецепте,
но не используя циклы для поиска. */

fun main() {
    val salad = arrayOf("onion", "potato", "green peas", "egg", "sausage", "apple", "pickles", "mayonnaise")
    println("Enter your inquiry:")
    val ingredient = readln()

    if (ingredient in salad)
        println("This ingredient is in the recipe")
    else
        println("There is no such ingredient in the recipe")


}