package Lesson4

fun main() {

    var weight = 50
    var volume = 100

    println("Груз весом $weight кг и объемом $volume л относится" +
            " к категории Average: ${(weight >= MIN_WEIGHT && weight
                                     <= MAX_WEIGHT) && volume < VOLUME}")

    weight = 20
    volume = 80

    println("Груз весом $weight кг и объемом $volume л относится" +
                " к категории Average: ${(weight >= MIN_WEIGHT && weight
                                          <= MAX_WEIGHT) && volume < VOLUME}")

    weight = 50
    volume = 100

    println(
        "Груз весом $weight кг и объемом $volume л относится" +
                " к категории Average: ${(weight >= MIN_WEIGHT && weight
                                          <= MAX_WEIGHT) && volume < VOLUME}")

}

const val MAX_WEIGHT = 100
const val MIN_WEIGHT = 35
const val VOLUME = 100