class PushWorker(private val stack: Stack) : Thread() {
    override fun run() {
        do {
            if (!interrupted()) {
                stack.push()
                println(currentThread().name)
            } else return
        } while (true)
    }
}