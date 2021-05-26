import kotlin.math.roundToInt

fun main() {
    var count = readLine()!!.toInt()
    while (count > 0) {
        count -= 1
        val i = readLine()!!.split(" ")
        var sum = 0.0
        for (index in 1..i[0].toInt()) {
            sum += i[index].toDouble()
        }
        val aver = sum / i[0].toDouble()
        var count2 = 0
        for (index in 1..i[0].toInt()) {
            if (i[index].toInt() > aver) {
                count2 += 1
            }
        }
        val percent = (((count2 / i[0].toDouble() * 100) * 1000).roundToInt() / 1000.0).toFloat()
        println("%.3f".format(percent).plus("%"))
    }
}