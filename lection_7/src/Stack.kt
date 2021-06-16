import java.util.concurrent.locks.ReentrantLock

class Stack {

    private val stackList = mutableListOf<Stack>()
    private val lock = ReentrantLock()
    private val condition = lock.newCondition()

    @Synchronized
    fun push () {
        if (stackList.isEmpty()) {
            stackList.add(Stack())
            condition.signal()
        } else {
            condition.await()
            println("Stack is full")
        }
    }

    @Synchronized
    fun pop() {
        if (stackList.isNotEmpty()) {
            stackList.removeLast()
            condition.signal()
        } else {
            condition.await()
            println("Stack is empty")
        }
    }
}