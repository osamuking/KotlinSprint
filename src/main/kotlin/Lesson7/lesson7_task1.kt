package Lesson7

fun main(){

    println("Your new password:")

    for (i in 0..2) {
        val symbol1 = ('a'..'z').random()
        val symbol2 = (0..9).random()
        print(symbol1)
        print(symbol2)
    }
}