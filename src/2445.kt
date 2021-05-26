fun main() {
    val i : Int = readLine()!!.toInt()
    var line = 1
    while (line <= i) {
        println("*".repeat(line).plus(" ".repeat(2 * (i - line))).plus("*".repeat(line)))
        line += 1
    }
    while (line > 1) {
        line -= 1
        println("*".repeat(line - 1).plus(" ".repeat(2 * (i - line + 1)).plus("*".repeat(line - 1))))
    }
}