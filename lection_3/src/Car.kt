class Car(color: Color, name: String, numberOfWheels: Int, maxPassengers: Int):
    Transport(color, name, numberOfWheels, maxPassengers) {

    override fun printTransportInfo() {
        println("Car color: $color, Car name: $name, Number of wheels: $numberOfWheels, Max passengers: $maxPassengers")
    }
}