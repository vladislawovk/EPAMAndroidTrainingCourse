fun main() {
    val car = Car(color = Color.RED, carModel = "modelCar")
    val bike = Bike(color = Color.BLUE, bikeModel = "modelBike")

    val carGarage = Garage<Car>()
    carGarage.addTransport(car)
    println(carGarage.getTransport())

    val bikeGarage = Garage<Bike>()
    bikeGarage.addTransport(bike)
    println(bikeGarage.getTransport())
    bikeGarage.removeTransport(bike)
    println(bikeGarage.getTransport())

    val carUiModel = carGarage.getTransport()
        .filter { it.color == Color.RED }
        .map { it.toTransportUiModel() }
}