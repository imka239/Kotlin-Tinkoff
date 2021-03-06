import java.util.*

class Queue<E>(elems: Collection<E> = LinkedList<E>()) {
    private val queue: MutableList<E> = LinkedList<E>();

    init {
        queue.addAll(elems)
    }

    constructor(vararg elems : E) : this() {
        queue.addAll(elems)
    }

    fun enqueue(elem : E) {
        queue.add(elem)
    }

    fun dequeue(): E {
        if (queue.isEmpty()) {
            throw Exception("queue is empty")
        }
        return queue.removeFirst()
    }

    fun safeDequeue(): E? {
        if (queue.isEmpty()) {
            println("queue is empty")
            return null
        }
        return queue.removeFirst()
    }

    fun size() : Int {
        return queue.size
    }
}