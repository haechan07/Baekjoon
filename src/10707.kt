import kotlin.math.min

fun main() {
    val A = readLine()!!.toInt()
    val B = readLine()!!.toInt()
    val C = readLine()!!.toInt()
    val D = readLine()!!.toInt()
    val P = readLine()!!.toInt()

    val X = A * P
    val Y = if (P > C) {
        B + D * (P - C)
    } else {
        B
    }
    println(min(X, Y))
}