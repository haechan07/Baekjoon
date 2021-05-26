fun main() {
    val time = readLine()!!.split(" ")
    var A = time[0].toInt()
    var B = time[1].toInt()
    val C = readLine()!!.toInt()
    B += C
    A += B / 60
    B %= 60
    A %= 24
    println("$A $B")
}