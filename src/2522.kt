fun main() {
    val N = readLine()!!.toInt()
    for (i in 1..N) {
        println(" ".repeat(N - i).plus("*".repeat(i)))
    }
    for (i in N - 1 downTo 1) {
        println(" ".repeat(N - i).plus("*".repeat(i)))
    }
}