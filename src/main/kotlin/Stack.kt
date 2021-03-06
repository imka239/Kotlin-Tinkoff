import java.util.*

class Stack<E>(elems: Collection<E> = LinkedList<E>()) {
    private val stack: MutableList<E> = LinkedList<E>();

    init {
        stack.addAll(elems)
    }

    constructor(vararg elems : E) : this() {
        stack.addAll(elems)
    }

    fun push(elem : E) {
        stack.add(elem)
    }

    fun pop(): E? {
        if (stack.isEmpty()) {
            throw Exception("stack is empty")
        }
        return stack.removeLast()
    }

    fun safePop(): E? {
        if (stack.isEmpty()) {
            println("stack is empty")
            return null
        }
        return stack.removeFirst()
    }

    fun size() : Int {
        return stack.size
    }
}