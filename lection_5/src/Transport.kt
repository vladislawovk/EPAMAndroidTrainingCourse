open class Transport(open val color: Color)

data class Car(override val color: Color, val carModel: String) : Transport(color)

data class Bike(override val color: Color, val bikeModel: String) : Transport(color)

fun Transport.toTransportUiModel() = TransportUiModel(color)