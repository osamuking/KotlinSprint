package Lesson2

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelTime = 457 //minutes

    val travelHours = (travelTime / 60).toInt()
    val travelMinutes = travelTime % 60
    var arrivingHours = departureHour + travelHours
    var arrivingMinutes = departureMinute + travelMinutes

    //Забегая немного вперёд и используя условный оператор if
    if (arrivingMinutes > 60) {
        arrivingHours += 1
        arrivingMinutes -= 60
    }
    if (arrivingMinutes < 10) {
        println("Время прибытия: $arrivingHours:0$arrivingMinutes")
    } else {
        println("Время прибытия: $arrivingHours:$arrivingMinutes")
    }
}