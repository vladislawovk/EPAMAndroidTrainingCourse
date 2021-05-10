class Motorcycle(color: Color, name: String, numberOfWheels: Int, maxPassengers: Int) :
    Transport(color, name, numberOfWheels, maxPassengers) {

    override fun printTransportInfo() {
        println("Motorcycle color: $color, Motorcycle name: $name, Number of wheels: $numberOfWheels, Max passengers: $maxPassengers")
    }
}