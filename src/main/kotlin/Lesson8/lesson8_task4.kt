package Lesson8

/* Задача 4 к Уроку 8

Представим, что мы получили массив ингредиентов. Программа должна распечатать весь список ингредиентов,
затем заменить нужный ингредиент на новый по желанию пользователя. После этого программа должна показать
обновленный список.
– создай массив со списком ингредиентов и напечатай его в консоль;
– запроси у пользователя информацию об ингредиенте, который он хочет заменить;
– если пользователь ввел ингредиент, которого нет в списке, вывести соответствующее сообщение;
– если есть, запроси ингредиент, который пользователь хотел бы добавить;
– выведи обновленный список с сообщением: “Готово! Вы сохранили следующий список: [список_ингредиентов]”. */

fun main() {
    val sweetBreadIngredients = arrayOf("flour", "butter", "sugar", "salt", "skimmed milk", "walnuts", "yeast", "water")
    println("Ingredients for the recipe of a sweet bread:")

    print(sweetBreadIngredients)

    println("What ingredient would you like to change?")
    var ingredient = readln()

    if (ingredient !in sweetBreadIngredients)
        println("There is no such ingredient in the recipe")
    else {
        println("What would you like to use instead of $ingredient?")
        val replacement = readln()
        sweetBreadIngredients[sweetBreadIngredients.indexOf(ingredient)] = replacement
        println("Done! You've saved a new recipe:")

        print(sweetBreadIngredients)
    }
}
fun print (x:Array<String>) {
    for (i in x)
        println("${x.indexOf(i) + 1}. $i")

}

