fun main() {
    // Task 1
    val kotlinTeacherOne = KotlinTeacher("Name One", "Last NameOne", 35, "A", 9.5)
    val kotlinTeacherTwo = KotlinTeacher("Name Two", "Last NameTwo", 27, "B", 1.5)
    println("Kotlin objects comparison: ${kotlinTeacherOne == kotlinTeacherTwo}")

    val javaTeacherOne = JavaTeacher("Name", "LastName", 30, "A", 4.5)
    val javaTeacherTwo = JavaTeacher("Name", "LastName", 30, "A", 4.5)
    println("Java objects comparison: ${javaTeacherOne == javaTeacherTwo}")

    // Task 2
    val car = Car("red", "Car name", 4, 4)
    car.getTransportInfo()

    val motorcycle = Motorcycle("blue", "Motorcycle name", 2, 2)
    motorcycle.getTransportInfo()

    val bus = Bus("Yellow", "Bus name", 6, 40)
    bus.getTransportInfo()
}