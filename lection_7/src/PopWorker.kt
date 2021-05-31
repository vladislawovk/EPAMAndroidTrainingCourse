class PopWorker(private val stack: Stack) : Thread() {
    override fun run() {
        do {
            if (!interrupted()) {
                stack.pop()
                println(currentThread().name)
            } else return
        } while (true)

    }
}