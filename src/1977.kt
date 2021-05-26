import kotlin.math.floor
import kotlin.math.sqrt

fun main() {
    var min = -1
    var toGetMin = true
    var count = 0
    val M = readLine()!!.toInt()
    val N = readLine()!!.toInt()
    for (i in M..N) {
        val sqrted = sqrt(i.toDouble())
        if ((sqrted - floor(sqrted)) == 0.00) {
            count += i
            if (toGetMin) {
                min = i
                toGetMin = false
            }
        }
    }
    if (toGetMin) {
        println(-1)
    } else {
        println(count)
        println(min)
    }
}