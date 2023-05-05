package Lesson9
/*
Напиши программу, которая запрашивает у пользователя пять названий ингредиентов (каждый по отдельности).

 – результат должен исключать повторы;
 – список должен выводиться в алфавитном порядке;
 – все элементы списка выведены в одну строку, разделяя слова запятыми;
 – первое слово должно быть напечатано с заглавной буквы, в конце списка должна стоять точка.
 */
fun main(){

    var i = 1
    var number = ""
    val listOfIngredients = mutableListOf<String>()
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
    listOfIngredients.sort()

    val separator = ", "
    val resultList = listOfIngredients.joinToString(separator)

    print("${makeTheFirstLetterHuge(resultList)}.")
}

fun makeTheFirstLetterHuge(string: String): String {
 return string.replaceFirstChar {
     if (it.isLowerCase())
         it.titlecase()
     else it.toString()
 }
}