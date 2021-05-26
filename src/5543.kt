import kotlin.math.min

fun main() {
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()
    val first2 = readLine()!!.toInt()
    val second2 = readLine()!!.toInt()
    println(min(min(first, second), third) + min(first2, second2) - 50)
}