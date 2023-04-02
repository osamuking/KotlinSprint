package Lesson2

fun main() {
    val crystalOreMined = 7
    val ironOreMined = 11

    val crystalOreBuff = crystalOreMined * 20 / 100
    val ironOreBuff = ironOreMined * 20 / 100

    println("\"Бонус\" для кристаллической руды: " + crystalOreBuff)
    println("\"Бонус\" для железной руды: " + ironOreBuff)
}