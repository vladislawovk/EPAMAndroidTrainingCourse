class PushWorker(private val stack: Stack) : Thread() {
    override fun run() {
        while (!interrupted()) {
            stack.push()
            println(currentThread().name)
        }
    }
}