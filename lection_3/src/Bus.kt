class Bus(color: String, name: String, numberOfWheels: Int, maxPassengers: Int) :
    Transport(color, name, numberOfWheels, maxPassengers) {

    override fun getTransportInfo() {
        println("Bus color: $color, Bus name: $name, Number of wheels: $numberOfWheels, Max passengers: $maxPassengers")
    }
}