class Stack {

    private val stackList = mutableListOf<Stack>()

    @Synchronized
    fun push () {
        if (stackList.isEmpty()) {
            stackList.add(Stack())
        } else {
            println("Stack is full")
        }
    }

    @Synchronized
    fun pop() {
        if (stackList.isNotEmpty()) {
            stackList.removeLast()
        } else {
            println("Stack is empty")
        }
    }
}