import java.lang.Exception
import java.util.*

class Queue<E> {
    private val queue = LinkedList<E>()

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