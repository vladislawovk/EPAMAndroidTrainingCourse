class MyCustomThread : Thread() {
    override fun run() {
        println(currentThread().name)
        try {
            sleep(5000)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }
        Thread {
            println(currentThread().name)
        }.start()
    }
}