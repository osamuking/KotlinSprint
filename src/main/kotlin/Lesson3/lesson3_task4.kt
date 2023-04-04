package Lesson3

fun main() {

    var moveFrom = "E2"
    var moveTo = "E4"
    var moveNumber = 1

    var currentState = "$moveFrom-$moveTo; $moveNumber"

    println(currentState)

    moveFrom = "E4"
    moveTo = "F5"
    moveNumber = 2

    println("$moveFrom-$moveTo; $moveNumber")


    moveFrom = "D2"
    moveTo = "D3"
    moveNumber = 3

    println("$moveFrom-$moveTo; $moveNumber")

}