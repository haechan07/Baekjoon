import java.util.ArrayDeque

fun main() {
    val deque = ArrayDeque<Int>()
    val times = readLine()!!.toInt()
    for (i in 0 until times) {
        val input = readLine()!!.split(" ")
        when (input[0]) {
            "push_front" -> deque.addFirst(input[1].toInt())
            "push_back" -> deque.addLast(input[1].toInt())
            "pop_front" -> {
                when (deque.isEmpty()) {
                    true -> {
                        println(-1)
                    }
                    false -> {
                        println(deque.removeFirst())
                    }
                }
            }
            "pop_back" -> {
                when (deque.isEmpty()) {
                    true -> {
                        println(-1)
                    }
                    false -> {
                        println(deque.removeLast())
                    }
                }
            }
            "size" -> {
                println(deque.size)
            }
            "empty" -> {
                when (deque.isEmpty()) {
                    true -> {
                        println(1)
                    }
                    false -> {
                        println(0)
                    }
                }
            }
            "front" -> {
                when (val a = deque.firstOrNull()) {
                    null -> {
                        println(-1)
                    }
                    else -> {
                        println(a)
                    }
                }
            }
            "back" -> {
                when (val a = deque.lastOrNull()) {
                    null -> {
                        println(-1)
                    }
                    else -> {
                        println(a)
                    }
                }
            }
        }
    }
}