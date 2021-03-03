fun main() {
    val stack = Stack<Int>()
    val queue = Queue<Int>()

    for (i in 0 until 10) {
        stack.push(i)
        queue.enqueue(i)
    }
    println("Check stack pop")
    for (i in 0 until 11) {
        println(stack.pop())
    }
    println("Now check queue pop")
    for (i in 0 until 11) {
        println(queue.dequeue())
    }
    stack.push(4)
    stack.push(4)
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
}