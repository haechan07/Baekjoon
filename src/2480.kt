import kotlin.math.max

fun main() {
    val input = readLine()!!.split(" ")
    when (true) {
        input[0] == input[1] && input[1] == input[2] -> println(10000 + 1000 * input[0].toInt())
        input[0] == input[1] || input[0] == input[2]-> println(1000 + 100 * input[0].toInt())
        input[1] == input[2] -> println(1000 + 100 * input[1].toInt())
        else -> println(max(max(input[0].toInt(), input[1].toInt()), input[2].toInt()) * 100)
    }
}