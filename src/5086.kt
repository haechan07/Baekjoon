fun main() {
    var toSkip = false
    while (!toSkip) {
        val input = readLine()!!.split(" ")
        when (true) {
            input[0] == "0" && input[1] == "0" -> toSkip = true
            input[1].toInt() % input[0].toInt() == 0 -> println("factor")
            input[0].toInt() % input[1].toInt() == 0 -> println("multiple")
            else -> println("neither")
        }
    }
}