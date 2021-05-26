import kotlin.collections.ArrayDeque

fun main() {
    val N = readLine()!!.toInt()
    val deque = ArrayDeque<Int>()
    for (i in 1..N) {
        deque.add(i)
    }
    while (deque.size != 1) {
        deque.removeAt(0)
        deque.add(deque[0])
        deque.removeAt(0)
    }
    println(deque[0])
}