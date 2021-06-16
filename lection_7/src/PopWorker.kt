class PopWorker(private val stack: Stack) : Thread() {
    override fun run() {
        while (!interrupted()) {
            stack.pop()
            println(currentThread().name)
        }
    }
}