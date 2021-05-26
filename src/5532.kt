import kotlin.math.max

val L = readLine()!!.toInt()
val A = readLine()!!.toInt()
val B = readLine()!!.toInt()
val C = readLine()!!.toInt()
val D = readLine()!!.toInt()

fun main() {
    val AC = if (A % C == 0) {
        A / C
    } else {
        A / C + 1
    }
    val BD = if (B % D == 0) {
        B / D
    } else {
        B / D + 1
    }
    println(L - max(AC, BD))
}