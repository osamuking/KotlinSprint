package lessons1to10.Lesson7

fun main(){

    print("Enter a number: \n")
    val number = readln().toInt()

    for (i in 0..number step 2){
        println(i)
    }
}