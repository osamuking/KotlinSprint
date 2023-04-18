package Lesson7

fun main(){
   
    println("Your new password:")

    for (i in 0..2) {
       var symbol1 = ('a'..'z').random()
       var symbol2 = (0..9).random()
       var symbol3 = ('a'..'z').random()
       var symbol4 = (0..9).random()
       var symbol5 = ('a'..'z').random()
       var symbol6 = (0..9).random()
       
       val password = "$symbol1$symbol2$symbol3$symbol4$symbol5$symbol6"
        println(password)
        break
    }
}
