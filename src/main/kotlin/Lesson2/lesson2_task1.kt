package Lesson2

import kotlin.concurrent.fixedRateTimer

fun main(){
    val markAthos = 3.0f
    val markPorthos = 4.0f
    val markAramis = 3.0f
    val markDArtagnan = 5.0f

    val averageMark = (markAramis + markAthos + markPorthos + markDArtagnan)/4

    println(averageMark)
}