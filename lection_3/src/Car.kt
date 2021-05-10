class Car(color: String, name: String, numberOfWheels: Int, maxPassengers: Int):
    Transport(color, name, numberOfWheels, maxPassengers) {

    override fun getTransportInfo() {
        println("Car color: $color, Car name: $name, Number of wheels: $numberOfWheels, Max passengers: $maxPassengers")
    }
}