package lessons1to10.Lesson9
/*
Задача 2 к Уроку 9
Создай новый список ингредиентов, состоящий из 3 шт. Выведи в консоль по одному ингредиенту на строку.
Нужно расширить функционал программы – пусть у пользователя будет возможность добавить к базовым ингредиентам из
списка еще один свой.
– после создания базового списка, вывести его в консоль с сообщением такого типа: "В рецепте есть базовые ингредиенты:
[базовый_список_ингредиентов]"
– затем сообщить о возможности добавить свой: "Желаете добавить еще?” и активировать ввод с консоли;
– если пользователь ввел “нет” или что-то иное – завершить программу, если пользователь ввел “да” – запросить:
"Какой ингредиент вы хотите добавить?"
– добавь считанное значение в базовый список;
– в конце выведи сообщение со списком всех элементов такого типа: "Теперь в рецепте есть следующие ингредиенты:
[список_ингредиентов]"
 */
fun main() {

    val incredibleRecipe = mutableListOf("saucepan", "water", "salt")
    println("There are some general ingredients:")
    incredibleRecipe.forEach {
        println(it)
    }
    println("\nWould you like to add something?")
    when(readln()) {
        "yes" -> {
            println("\nWhat would you like to add?")
            incredibleRecipe.add(readln())
        }
        else -> return
    }
    println("\nNow you have the following ingredients in the recipe:")
    incredibleRecipe.forEach {
        println(it)
    }
}