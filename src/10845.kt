fun main() {
    val orders = readLine()!!.toInt()
    val queue = mutableListOf<Int>()
    for (i in 1..orders) {
        val input = readLine()!!.split(" ")
        when (input[0]) {
            "push" -> queue.add(input[1].toInt())
            "pop" -> when (queue.isEmpty()) {
                true -> println("-1")
                else -> {println(queue[0])
                    queue.removeAt(0)}
            }
            "size" -> println(queue.size)
            "empty" -> when (queue.isEmpty()) {
                true -> println("1")
                else -> println("0")
            }
            "front" -> when (queue.isEmpty()) {
                true -> println("-1")
                else -> println(queue[0])
            }
            "back" -> when (queue.isEmpty()) {
                true -> println("-1")
                else -> println(queue.last())
            }
        }
    }
}