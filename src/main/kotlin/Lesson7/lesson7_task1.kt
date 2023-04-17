package Lesson7

fun main(){
    var symbol1 = '1'
    var symbol2 = 0
    var symbol3 = '1'
    var symbol4 = 0
    var symbol5 = '1'
    var symbol6 = 0

    println("Your new password:")

    for (i in 0..2) {
        symbol1 = ('a'..'z').random()
        symbol2 = (0..9).random()
        symbol3 = ('a'..'z').random()
        symbol4 = (0..9).random()
        symbol5 = ('a'..'z').random()
        symbol6 = (0..9).random()
    }
    val password = "$symbol1$symbol2$symbol3$symbol4$symbol5$symbol6"

    println(password)
}