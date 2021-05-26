fun main() {
    val N = readLine()!!.toInt()
    val map = mutableMapOf<Int, MutableSet<Int>>()
    for (i in 0 until N) {
        val (a, b) = readLine()!!.split(" ").map {it.toInt()}
        when (map.containsKey(a)) {
            true -> map[a]!!.add(b)
            false -> map[a] = mutableSetOf(b)
        }
    }
    for (i in map.keys.toSortedSet()) {
        for (j in map[i]!!.toSortedSet()) {
            println("$i $j")
        }
    }
}