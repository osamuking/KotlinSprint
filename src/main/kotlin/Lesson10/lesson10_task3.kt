package Lesson10

/*
Напиши программу, которая генерирует пароли. Пароль должен состоять из чередующихся цифр
и специальных символов. Например, #5%6”2.
– пользователь сам задает длину пароля;
– для генерации пароля должна быть отдельная функция, принимающая целочисленное значение
длины пароля и возвращающая готовый пароль;
– пароль должен содержать цифры от 0 до 9, специальные символы: !"#$%&'()*+,-./ и пробел (всего 16 спецсимволов).
 */
fun main() {
    println("Enter desired password length")
    val passwordLength = readln().toInt()
    password(passwordLength)

}

fun password(x: Int) {
    var password = ""
    val a = 0..9
    val b: List<Char> = listOf('!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', '-', '.', '/', ' ')
    val c = a + b

    for (i in 0 until x)
        password += c.random()
    println("Here is your password:\n$password")
}