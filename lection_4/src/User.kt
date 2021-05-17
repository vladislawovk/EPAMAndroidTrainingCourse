typealias MapperClass = UserUiModel

data class User(
    val firstName: String,
    val lastName: String,
    val age: Int,
    val location: String
)

fun User.print(location: String = "unknown" ,printInfo: (String) -> Unit) {
    println("$firstName $lastName $age $location")
    printInfo("$firstName $lastName $age $location")
}

inline fun User.printInlined(location: String = "unknown" ,printInfo: (String) -> Unit) {
    println("$firstName $lastName $age $location")
    printInfo("$firstName $lastName $age $location")
}

fun User.toUserUiModel() = MapperClass(
    firstName = firstName,
    lastName = lastName
)

fun main() {
    val user = User(firstName = "Name", lastName = "Surname", 24, "Russia")
    user.print("Russia") { printInfo: String -> println(printInfo) }
    user.printInlined("Russia") { printInfo: String -> println(printInfo) }
    println(user.toUserUiModel())
}
