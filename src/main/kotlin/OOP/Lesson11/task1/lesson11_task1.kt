package OOP.Lesson11.task1

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
)
fun main() {
    val user1: User = User(
        id = 1,
        login = "user1",
        password = "User1Pass",
        email = "user1@mail.ru",
    )
    val user2 = User(
        id = 2,
        login = "user2",
        password = "User2Pass",
        email = "user2@mail.ru",
    )
    println("""
        User 1 info:
        ID: ${user1.id}
        Login: ${user1.login}
        Password: ${user1.password}
        E-mail: ${user1.email}
        
    """.trimIndent())
    println("""
        User 2 info:
        ID: ${user2.id}
        Login: ${user2.login}
        Password: ${user2.password}
        E-mail: ${user2.email}
        
    """.trimIndent())
}