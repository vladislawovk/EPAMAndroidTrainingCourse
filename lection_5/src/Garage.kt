class Garage<T : Transport> {

    private val transportList: MutableList<T> = mutableListOf()

    fun addTransport(transport: T) {
        transportList.add(transport)
    }

    fun removeTransport(transport: T) {
        if (transportList.isNotEmpty()) transportList.remove(transport) else println("List is empty")
    }

    fun getTransport(): List<T> {
        return transportList.toList()
    }
}