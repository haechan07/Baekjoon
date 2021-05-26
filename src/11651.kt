fun main() {
    val N = readLine()!!.toInt()
    val map = mutableMapOf<Int, MutableSet<Int>>()
    for (i in 0 until N) {
        val (a, b) = readLine()!!.split(" ").map {it.toInt()}
        when (map.containsKey(b)) {
            true -> map[b]!!.add(a)
            false -> map[b] = mutableSetOf(a)
        }
    }
    for (i in map.keys.toSortedSet()) {
        for (j in map[i]!!.toSortedSet()) {
            println("$j $i")
        }
    }
}