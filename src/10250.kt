fun main() {
    var T = readLine()!!.toInt()
    while (T > 0) {
        val input = readLine()!!.split(" ")
        val H = input[0].toInt()
        val N = input[2].toInt()
        val R = when (N % H) {
            0 -> H
            else -> N % H
        }
        when (N % H) {
            0 -> println(R * 100 + (N / H))
            else -> println(R * 100 + (N / H) + 1)
        }
        T--
    }
}