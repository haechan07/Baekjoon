fun main() {
    val nums = readLine()!!.toInt()
    var pair = Pair(0, 1)
    for (i in 0 until nums) {
        pair = Pair(pair.second, pair.first + pair.second)
    }
    println(pair.first)
}