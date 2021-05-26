import java.io.BufferedWriter
import java.io.OutputStreamWriter


fun main() {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val input = readLine()!!.split("-")
    for (i in 0 until input.size) {
        bw.append(input[i][0])
    }
    bw.newLine()
    bw.flush()
    bw.close()
}