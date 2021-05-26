fun main() {
    val i = readLine()!!.toInt()
    var line = 1
    while (line <= i) {
        println("*".repeat(line))
        line += 1
    }
}