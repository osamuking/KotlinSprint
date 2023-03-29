package Lesson1

fun main() {
    val length: Long = 40_868_600_000L
    val age: Byte = 27
    val partOfDay: Float = 0.075f
    val seconds: Short = 6480
    val partOfYear: Double = 2.0547945205479453e-4
    val apogee: Int = 237000

    print("""
        Расстояние: $length миллиметров
        Возраст: $age лет
        Часть дня: $partOfDay
        Секунды: $seconds сек
        Часть года: $partOfYear
        Апогей орбиты: $apogee метров
    """.trimIndent())

}