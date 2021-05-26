fun main() {
    val i = readLine()!!.split(" ")
    val a = i[0].toInt()
    val b = i[1].toInt()
    val c = i[2].toInt()
    if (b >= c) {
        println(-1)
    } else {
        println(a / (c - b) + 1)
    }
}