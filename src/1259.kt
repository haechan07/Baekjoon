fun main() {
    var toStop = false

    while(!toStop) {
        val input = readLine()
        when (input) {
            "0" -> toStop = true
            input!!.reversed() -> println("yes")
            else -> println("no")
        }
    }
}