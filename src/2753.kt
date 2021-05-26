fun main() {
    val i = readLine()!!.toInt()
    when (true) {
        i % 4 == 0 && i % 100 != 0 -> println("1")
        i % 400 == 0 -> println("1")
        else -> println("0")
    }
}