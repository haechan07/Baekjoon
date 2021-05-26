fun main() {
    val count = readLine()!!.toInt()
    val ways = Array<Int>(10){1}
    ways[0] = 1
    ways[1] = 2
    ways[2] = 4
    for (i in 1..count) {
        val input = readLine()!!.toInt()
        for (input2 in 4..input) {
            ways[input2 - 1] = ways[input2 - 2] + ways[input2 - 3] + ways[input2 - 4]
        }
        println(ways[input - 1])
    }
}