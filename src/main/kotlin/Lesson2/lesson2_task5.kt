package Lesson2

import kotlin.math.exp
import kotlin.math.ln

fun main() {

    val deposit = 70_000.0
    val interestRate = 16.7
    val years = 20.0
    val sum: Double

    val s: Double = (1 + interestRate / 100)

    sum = deposit * pow(s, years)
    println("Сумма вклада через 20 лет составит " + String.format("%.3f", sum) + " рублей.")
}
fun pow(a: Double, b: Double): Double {
    return exp(ln(a) * b)
}