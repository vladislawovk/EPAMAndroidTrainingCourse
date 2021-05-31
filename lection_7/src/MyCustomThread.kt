class MyCustomThread : Thread() {
    override fun run() {
        println(currentThread().name)
        sleep(5000)
        Thread {
            println(currentThread().name)
        }.start()
    }
}