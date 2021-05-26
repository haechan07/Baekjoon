fun main() {
    val N = readLine()!!.toInt()
    var sum = 0
    for (i in 0 until N) {
        sum += readLine()!!.toInt()
    }
    println(sum - (N - 1))
}