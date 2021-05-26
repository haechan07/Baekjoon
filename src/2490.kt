import java.util.*

fun main() {
    for (i in 1..3) {
        val input = readLine()!!.split(" ")
        if (input[0] == "1" && input[1] == "1" && input[2] == "1" && input[3] == "1") {
            println("E")
            continue
        }
        when (Collections.frequency(input, "0")) {
            1 -> println("A")
            2 -> println("B")
            3 -> println("C")
            4 -> println("D")
        }
    }
}