package lessons1to10.Lesson4

fun main(){

    var orderedToday = 13
    var orderedTomorrow = 9

    val isAvailableToday = orderedToday < TABLES_NUMBER
    val isAvailableTomorrow = orderedTomorrow < TABLES_NUMBER
    println("Доступность столиков на сегодня: $isAvailableToday\n" +
            "Доступность столиков на завтра: $isAvailableTomorrow")
}

const val TABLES_NUMBER = 13