import java.util.*

class Stack<E>(vararg elems: E) {
    private val stack: LinkedList<E> = LinkedList<E>()

    init {
        for (elem in elems) {
            stack.add(elem)
        }
    }

    fun push(elem : E) {
        stack.add(elem)
    }

    fun pop(): E? {
        if (stack.isEmpty()) {
            println("stack is empty")
            return null
        }
        return stack.pollLast()
    }

    fun size() : Int {
        return stack.size
    }
}