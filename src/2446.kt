fun main() {
    val i = readLine()!!.toInt()
    var line = i
    while (line >= 1) {
        println(" ".repeat(i - line).plus("*".repeat(2 * line - 1)))
        line -= 1
    }
    while (line < i - 1) {
        println(" ".repeat(i - line - 2).plus("*".repeat(line * 2 + 3)))
        line += 1
    }
}