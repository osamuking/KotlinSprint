package lessons1to10.Lesson2

fun main() {

    // Формула для расчета сложных процентов:
    // Sf = Si * (1 + p / 100)^n

    val deposit =  70_000.0
    val interestRate = 16.7
    val years = 20.0
    var sum: Double
    var s: Double

    s = (1 + interestRate / 100)
    sum = deposit * Math.pow(s, years)

    println("Сумма вклада через 20 лет составит " + String.format("%.3f", sum) + " рублей.")

}
