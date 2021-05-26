import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val T = br.readLine().toInt()
    for (i in 1..T) {
        val input = br.readLine().split(",")
        val A = input[0].toInt()
        val B = input[1].toInt()
        bw.append((A + B).toString())
        bw.newLine()
    }
    bw.flush()
    bw.close()
}