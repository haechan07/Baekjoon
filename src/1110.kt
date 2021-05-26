val t = readLine()!!.toInt()
var cycle = 0

fun main() {
    cycle(t / 10, t % 10)
    println(cycle)
}

fun cycle(a : Int, b : Int) {
    val c = (a + b) % 10
    cycle += 1
    if (b * 10 + c != t) {
        cycle(b, c)
    }
}