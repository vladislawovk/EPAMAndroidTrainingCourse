import java.util.concurrent.*

fun main() {
    fun runFirstTask() {
        val mainThread = Thread.currentThread()
        println(Thread.currentThread().name)
        MyCustomThread().start()
        mainThread.join(6000)
        println("${Thread.currentThread().name} is ready")
    }

    fun runSecondTask() {

        val stackObject = StackFactory.createStack()

        val pushWorker = PushWorker(stackObject)
        val popWorker = PopWorker(stackObject)

        pushWorker.start()
        println("${pushWorker.name} start")
        popWorker.start()
        println("${popWorker.name} start")
        Thread.sleep(3000)

        pushWorker.interrupt()
        println("${pushWorker.name} stop")
        popWorker.interrupt()
        println("${popWorker.name} stop")

    }

    fun runThirdTask() {

        val executorService1 = Executors.newSingleThreadExecutor()
        for (i in 0..2) {
            executorService1.execute { println(Thread.currentThread().name) }
        }
        executorService1.shutdown()

        val executorService2 = Executors.newFixedThreadPool(3)
        for (i in 0..4) {
            executorService2.submit(Callable { println(Thread.currentThread().name) })
        }
        executorService2.shutdown()

        val executorService3 = Executors.newCachedThreadPool()
        for (i in 0..2) {
            executorService3.execute { println(Thread.currentThread().name) }
        }
        executorService3.shutdown()

        val executorService4 = Executors.newScheduledThreadPool(2)

        executorService4.execute {
            for (i in 0..2) {
                println(Thread.currentThread().name)
                Thread.sleep(3000)
            }
        }
        executorService4.shutdown()
    }

    runFirstTask()
    runSecondTask()
    runThirdTask()

}