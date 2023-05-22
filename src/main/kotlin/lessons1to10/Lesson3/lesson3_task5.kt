package lessons1to10.Lesson3

fun main(){

    val currentState = "D2-D4;0"

    val stateInfo = currentState.split("-", ";")

    val moveFrom = stateInfo[0]
    val moveTo = stateInfo[1]
    val moveNumber = stateInfo[2]

    println("Move from: $moveFrom")
    println("Move to: $moveTo")
    println("Move number: $moveNumber")
}