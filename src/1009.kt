import kotlin.math.pow

fun main() {
    val T = readLine()!!.toInt()
    for (i in 0 until T) {
        val input = readLine()!!.split(" ")
        val a = input[0].toDouble() % 10
        val b = input[1].toInt()
        val datas = when (b % 4) {
            0 -> a.pow(4).toInt()
            else -> a.pow(b % 4).toInt()
        }
        when (datas % 10) {
            0 -> println(10)
            else -> println(datas % 10)
        }
    }
}