fun main() {
    var sum = 0
    for (i in 1..5) {
        val input = readLine()!!.toInt()
        sum += if (input < 40) {
            40
        } else {
            input
        }
    }
    val aver = sum / 5
    println(aver)
}