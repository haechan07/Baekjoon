fun main() {
    val i = readLine()!!.split(" ")
    val K = i[0].toInt()
    val N = i[1].toInt()
    val M = i[2].toInt()
    if (K * N > M) {
        println(K * N - M)
    } else {
        println(0)
    }
}