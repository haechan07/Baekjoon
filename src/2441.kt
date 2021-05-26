fun main() {
    var i = readLine()!!.toInt()
    var line = 0
    while (i > 0) {
        println(" ".repeat(line).plus("*".repeat(i)))
        i -= 1
        line += 1
    }
}