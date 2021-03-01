import java.lang.Exception
import java.util.*

class Stack<E> {
    private val stack = LinkedList<E>()

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