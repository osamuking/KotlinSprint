package lessons1to10.Lesson9

fun main() {

    val omelet = mutableListOf<Int>(2, 50, 15)

    println("For how many person would you like to make the dish?")
    val numberOfPerson = readln().toInt()
    
    val omelet2 = omelet.map { it * numberOfPerson }

    println(
        "For $numberOfPerson persons you need: Eggs - ${omelet2[0]}, Milk - ${omelet2[1]}, Butter -" +
                    "${omelet2[2]}"
    )
}