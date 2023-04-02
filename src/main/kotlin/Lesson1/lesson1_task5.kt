package Lesson1

fun main() {
    var flightSeconds = 6480
    var flightMinutes = flightSeconds / 60

    var sec = flightSeconds % 60

    print("$flightMinutes:$sec")

}