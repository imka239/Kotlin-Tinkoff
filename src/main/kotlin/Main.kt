import java.util.*

fun main() {
    val stack = Stack<Int>()
    val queue = Queue<Int>()

    for (i in 0 until 10) {
        stack.push(i)
        queue.enqueue(i)
    }
    println("Check stack pop")
    for (i in 0 until 10) {
        println(stack.pop())
    }
    println("Now check queue pop")
    for (i in 0 until 10) {
        println(queue.dequeue())
    }
    stack.push(4)
    stack.push(4)
    println(stack.pop())
    println(stack.pop())
    //DLS
    val st = Stack(listOf(1, 2, 3))
    print(st.pop())
    print(st.pop())
    print(st.pop())
    val que = Queue(1, 2, 3)
    print(que.dequeue())
    print(que.dequeue())
    print(que.dequeue())
}