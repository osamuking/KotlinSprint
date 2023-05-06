package Lesson9

fun main(){

    println("Enter any five ingredients:")
    val userInput = readln()

    val listOfIngredients = userInput.split(", ").toMutableList()

    println("Here's your list in alphabetical order:")
    listOfIngredients.sort()
    listOfIngredients.forEach {
        println(it)
    }
}