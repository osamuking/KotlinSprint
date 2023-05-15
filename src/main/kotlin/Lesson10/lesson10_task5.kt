package Lesson10

fun main() {
    println("Enter your login")
    var log = readln()
    while (proofLength(log)) {
        attention()
        log = readln()
    }

    println("We can generate a password for you. Enter the desired password length")
    val passwordSize = readln().toInt()
    val password = makePassword(passwordSize)
    println("Here is your password: $password")

    println("""In order to use our service you must enter your login and password.
Your login:
    """.trimIndent())
    while (readln() != log) {
        println("We couldn't find your account, try again:")
    }
    println("Your password:")
    while (readln() != password) {
        println("Wrong password, try again:")
    }

    println("""Now hit the Enter key and wait about 3 seconds so that
we can send you an email with a verification code.""".trimIndent())
    while (true) {
        val code = generateCode().toInt()
        readln()
        getCode(code.toString())
        if (readln().toInt() != code)
            println("Wrong code. We'll sent another one for you. Hit the Enter key again.")
        else {
            println("Registration successful!")
            break
        }
    }
}

fun proofLength(string: String): Boolean {
    val list: List<Char> = string.toList()
    return (list.size < 4)
}

fun attention() {
    println("You should use at least four symbols. Enter your login again")
}

fun makePassword(length: Int): String {
    var password = ""
    val range = '!'..'~'
    for (i in 0 until length)
        password += range.random()
    return password
}

fun generateCode(): String {
    var code = ""
    val range = 0..9
    for (i in 0..3)
        code += range.random().toString()
    return code
}

fun getCode(code: String) {
    Thread.sleep(3000)
    print("Your code is: $code")
    println("\nNow enter your code to authorize your account:")
}