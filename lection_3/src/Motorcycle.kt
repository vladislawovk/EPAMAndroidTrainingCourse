class Motorcycle(color: String, name: String, numberOfWheels: Int, maxPassengers: Int) :
    Transport(color, name, numberOfWheels, maxPassengers) {

    override fun getTransportInfo() {
        println("Motorcycle color: $color, Motorcycle name: $name, Number of wheels: $numberOfWheels, Max passengers: $maxPassengers")
    }
}