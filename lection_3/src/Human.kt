sealed class Human() {

    class Student(
        val age: Int,
        val name: String,
        val examScore: Double,
        val faculty: String,
        val status: Status
    ) : Human()

    class Teacher(
        val name: String,
        val workExperience: Double,
        val age: Int,
        val status: Status
    ) : Human()

    class Rector(
        val name: String,
        val universityName: String,
        val status: Status
    ) : Human()
}