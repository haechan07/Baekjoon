fun main() {
    val N = readLine()!!.toInt()
    var temp = 0
    for (i in 0 until N) {
        val j = readLine()!!.toInt()
        when (j) {
            1 -> temp++
            0 -> temp--
        }
    }
    when (temp < 0) {
        true -> println("Junhee is not cute!")
        false -> println("Junhee is cute!")
    }
}