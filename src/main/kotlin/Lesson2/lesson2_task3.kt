package Lesson2

fun main(){
    val departureHour = 9
    val departureMinute = 31
    val travelTime = 457 //minutes

    val travelHours = (travelTime / 60).toInt()
    val travelMinutes = travelTime % 60
    var arrivingHour = departureHour + travelHours
    var arrivingMiinute = departureMinute + travelMinutes

    if(arrivingMiinute > 60) {
        arrivingHour ++
        arrivingMiinute -= 60
    }
    if(arrivingMiinute < 10) {
        println("Время прибытия: $arrivingHour:0$arrivingMiinute")
    } else {
        println("Время прибытия: $arrivingHour:$arrivingMiinute")
    }
}