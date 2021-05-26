fun main() {
    var p = Pair(0, 1)
    val N = readLine()!!.toInt()
    for (i in 1..N) {
        p = Pair(p.second, p.first + p.second)
    }
    println(p.first)
}