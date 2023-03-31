package Lesson1

fun main() {
    var flightSeconds = 64763.00f
    var flightMinutes = flightSeconds/60

    var min = flightMinutes.toInt()
    var sec = (60 * (flightMinutes - min)).toInt()

    print("$min:$sec")

}