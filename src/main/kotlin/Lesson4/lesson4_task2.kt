package Lesson4

fun main() {

    var weight = 42
    var volume = 95
    var isGoodsAccepted = (weight >= MIN_WEIGHT && weight <= MAX_WEIGHT)
                          && volume < VOLUME
    println("\nГруз весом $weight кг и объемом $volume л относится" +
            " к категории Average: $isGoodsAccepted")

    weight = 20
    volume = 80
    isGoodsAccepted = (weight >= MIN_WEIGHT && weight <= MAX_WEIGHT)
                       && volume < VOLUME
    println("Груз весом $weight кг и объемом $volume л относится" +
            " к категории Average: $isGoodsAccepted")

    weight = 50
    volume = 100
    isGoodsAccepted = (weight >= MIN_WEIGHT && weight <= MAX_WEIGHT)
                       && volume < VOLUME
    println("Груз весом $weight кг и объемом $volume л относится" +
            " к категории Average: $isGoodsAccepted")

}

const val MAX_WEIGHT = 100
const val MIN_WEIGHT = 35
const val VOLUME = 100