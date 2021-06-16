import java.util.concurrent.*
import java.util.concurrent.Executor

fun main() {
    runFirstTask()
    runSecondTask()
    runThirdTask()
}

fun runFirstTask() {
    val mainThread = Thread {
        println(Thread.currentThread().name)
    }
    mainThread.start()
    mainThread.join()
    MyCustomThread().start()
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
        executorService2.submit(Callable { Thread.currentThread().name })
        println(executorService2)
    }
    executorService2.shutdown()

    val executorService3 = Executors.newCachedThreadPool()
    for (i in 0..2) {
        executorService3.execute { println(Thread.currentThread().name) }
    }
    executorService3.shutdown()

    val executorService4 = Executors.newScheduledThreadPool(2)

    var count = 0
    while (count < 2) {
        executorService4.schedule(
            Executor(),
            3,
            TimeUnit.SECONDS
        )
        count++
    }
    executorService4.shutdown()
}

