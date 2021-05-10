class Bus(color: Color, name: String, numberOfWheels: Int, maxPassengers: Int) :
    Transport(color, name, numberOfWheels, maxPassengers) {

    override fun printTransportInfo() {
        println("Bus color: $color, Bus name: $name, Number of wheels: $numberOfWheels, Max passengers: $maxPassengers")
    }
}