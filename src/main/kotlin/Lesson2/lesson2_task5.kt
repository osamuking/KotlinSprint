package Lesson2

fun main() {

    val deposit = 70_000.0
    val interestRate = 16.7
    val years = 20.0
    var sum: Double
    var s: Double

    s = (1 + interestRate / 100)
    sum = deposit * pow(s, years)
    println("Сумма вклада через 20 лет составит " + String.format("%.3f", sum) + " рублей.")
}
fun pow(a: Double, b: Double): Double {
    return Math.exp(Math.log(a) * b)
}