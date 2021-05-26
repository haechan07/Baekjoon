fun main() {
    val N = readLine()!!.toInt()
    var rest = 0
    for (i in 0 until N) {
        val input = readLine()!!.split(" ")
        rest += input[1].toInt() % input[0].toInt()
    }
    println(rest)
}