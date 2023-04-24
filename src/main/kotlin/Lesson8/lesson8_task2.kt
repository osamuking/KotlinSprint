package Lesson8

/* Задача 2 к Уроку 8

Представь, что ты работаешь над приложением с рецептами. Напиши код, который проверяет, есть ли нужный
ингредиент в рецепте.
– создай массив, в котором будет храниться список ингредиентов для определенного блюда;
– далее через консоль запроси у пользователя информацию об ингредиенте, который он хочет найти;
– произведи поиск элемента по массиву, используя цикл for;
– если ингредиент в списке есть, выведи в консоль сообщение - “Ингредиент     [название] в рецепте есть”;
– если нет, сообщать: “Такого ингредиента в рецепте нет”. */

fun main() {
    val salad = arrayOf("onion", "potato", "green peas", "egg", "sausage", "apple", "pickles", "mayonnaise")
    println("Enter your inquiry:")
    val ingredient = readln()

    for (i in salad) {
        if (i == ingredient) {
            println("Ingredient $ingredient was found in the recipe")
            return
        }
    }
        println("There is no such ingredient in the recipe")
}