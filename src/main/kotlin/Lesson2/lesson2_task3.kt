package Lesson2

fun main() {

    val departureHour = 9
    val departureMinute = 39
    val travelTime = 450 //minutes

    val travelHours = (travelTime / 60)
    val travelMinutes = travelTime % 60
    var arrivingHour = departureHour + travelHours
    var arrivingMinute = departureMinute + travelMinutes

    if (arrivingMinute > 60) {
        arrivingHour += 1
        arrivingMinute -= 60
    }

    println("Arriving time: ${"%02d".format(arrivingHour)}:" +
            "${"%02d".format(arrivingMinute)}" )

}