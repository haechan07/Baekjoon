fun main() {
    while (true) {
        val (A, B) = readLine()!!.split(" ").map {it.toInt()}
        when (A == 0 && B == 0) {
            true -> break
            false -> println(A + B)
        }
    }
}