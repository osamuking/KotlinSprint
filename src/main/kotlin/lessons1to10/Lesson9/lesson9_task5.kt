package lessons1to10.Lesson9
/*
Напиши программу, которая запрашивает у пользователя пять названий
 ингредиентов (каждый по отдельности).
 – результат должен исключать повторы;
 – список должен выводиться в алфавитном порядке;
 – все элементы списка выведены в одну строку, разделяя слова запятыми;
 – первое слово должно быть напечатано с заглавной буквы, в конце списка
 должна стоять точка.
 */
fun main(){

    /*
    var number = ""
    val listOfIngredients = mutableListOf<String>()
    var i = 1
    while (i <= 5) {
        when (i) {
            1 -> number = "first"
            2 -> number = "second"
            3 -> number = "third"
            4 -> number = "fourth"
            5 -> number = "fifth"
        }
        println("Enter the $number ingredient:")
        val userInput = readln()
        if (listOfIngredients.contains(userInput)) {
            println("This ingredient is already in the list")
            continue
        }
        listOfIngredients.add(userInput)
            i++
    }
    */

    var number = ""
    val listOfIngredients = mutableSetOf<String>()

    for (i in 1..5) {
        when (i) {
            1 -> number = "first"
            2 -> number = "second"
            3 -> number = "third"
            4 -> number = "fourth"
            5 -> number = "fifth"
        }
        println("Enter the $number ingredient:")
        val userInput = readln()
        if (listOfIngredients.contains(userInput)) {
            println("This ingredient is already in the list")
        }
        listOfIngredients.add(userInput)
    }

    print("${capitalizeFirstLetter(listOfIngredients.sorted().joinToString(", "))}.")
}

fun capitalizeFirstLetter(string: String) =
    string.replaceFirstChar {
        if (it.isLowerCase())
            it.titlecase()
        else it.toString()
}
