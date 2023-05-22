package lessons1to10.Lesson2

fun main(){

val staffAmount = 50
val traineeAmount = 30
val staffSalary = 30000
val traineeSalary = 20000

val staffPayroll = staffAmount * staffSalary
val traineePayroll = traineeAmount * traineeSalary
val generalPayroll = staffPayroll + traineePayroll
val averageSalary = ((staffSalary + traineeSalary) / 2).toInt()

print("""Расходы на зарплату для постоянных сотрудников:
        |$staffPayroll
        |Общие расходы компании на зарплату:
        |$generalPayroll
        |Средняя зарплата по компании:
        |$averageSalary
    """.trimMargin())

}