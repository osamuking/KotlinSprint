package lessons1to10.Lesson9

fun main() {
    val sweetBreadIngredients = listOf("flour", "yeast", "butter", "salt", "sugar", "walnuts", "skimmed milk", "water")
    println("There are following ingredients in the recipe:")
    sweetBreadIngredients.forEach {
        println(it)
    }
}