class Executor: Runnable {
    override fun run() {
        println(Thread.currentThread().name)
    }
}