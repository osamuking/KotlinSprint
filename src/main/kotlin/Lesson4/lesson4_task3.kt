package Lesson4

fun main(){

    //Today's conditions
    val weather = "Sunny"
    val tentState = "Opened"
    val humidity = 20
    val season = "Winter"

    val conditions = weather == "Sunny" && tentState == "Opened" &&
            humidity == 20 && season != "Winter"

    print("Благоприятные ли сейчас условия для роста бобовых? $conditions")

}