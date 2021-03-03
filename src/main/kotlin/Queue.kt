import java.util.*

class Queue<E>(vararg elems: E) {
    private val queue : LinkedList<E> = LinkedList()

    init {
        for (elem in elems) {
            queue.add(elem)
        }
    }

    fun enqueue(elem : E) {
        queue.add(elem)
    }

    fun dequeue(): E? {
        if (queue.isEmpty()) {
            println("queue is empty")
            return null
        }
        return queue.pollFirst()
    }

    fun size() : Int {
        return queue.size
    }
}