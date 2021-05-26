fun main() {
    val (a, b, c) = readLine()!!.split(" ")
    val list = mutableListOf(a.toInt(), b.toInt(), c.toInt())
    list.sort()
    println(list.joinToString(" "))
}