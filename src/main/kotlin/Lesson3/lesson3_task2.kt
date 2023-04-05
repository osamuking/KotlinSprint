package Lesson3

fun main(){

    val name = "Татьяна"
    val middleName = "Сергеевна"
    var familyName = "Андреева"
    var age = 20

    println("""Данные до замужества:
          $familyName $name $middleName, $age лет
    """.trimIndent())

    familyName = "Сидорова"
    age = 22

    println("""Данные после замужества:
          $familyName $name $middleName, $age года
    """.trimIndent())

}