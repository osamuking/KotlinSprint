package Lesson8

fun main() {
    val salad = arrayOf("onion", "potato", "green peas", "egg", "sausage", "apple", "pickles", "mayonnaise")
    println("Enter your inquiry:")
    val ingredient = readln()

    for (i in salad) {
        if (ingredient in salad) {
            println("Ingredient $ingredient was found in the recipe")
            break
        } else {
            println("There is no such ingredient in the recipe")
            break
        }
    }
}