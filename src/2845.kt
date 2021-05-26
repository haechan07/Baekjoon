fun main() {
    val (L, P) = readLine()!!.split(" ")
    val num = L.toInt() * P.toInt()
    val list = readLine()!!.split(" ")
    for (i in 0 until 5) {
        print("${list[i].toInt() - num} ")
    }
}