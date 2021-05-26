import kotlin.math.pow
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val input = br.readLine().split(" ")
        if (input[0] == "0" && input[1] == "0" && input[2] == "0") {
            bw.flush()
            bw.close()
            break
        }
        val a = input[0].toDouble()
        val b = input[1].toDouble()
        val c = input[2].toDouble()
        val list = mutableListOf(a, b, c)
        list.sort()

        when (list[0].pow(2.0) + list[1].pow(2.0) == list[2].pow(2.0)) {
            true -> {bw.append("right")
                bw.newLine()}
            else -> {bw.append("wrong")
                bw.newLine()}
        }
    }
}