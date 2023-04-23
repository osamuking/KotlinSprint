package Lesson8

fun main() {
    val salad = arrayOf("onion", "potato", "green peas", "egg", "sausage", "apple", "pickles", "mayonnaise")
    println("Enter your inquiry:")
    val ingredient = readln()

    if (ingredient in salad)
        println("This ingredient is in the recipe")
    else
        println("There is no such ingredient in the recipe")


}