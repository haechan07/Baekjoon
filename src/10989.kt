import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val input = BufferedReader(InputStreamReader(System.`in`))
    val output = BufferedWriter(OutputStreamWriter(System.out))

    val n = input.readLine().toInt()
    val array = Array(10001){0}
    for (i in 1..n) {
        val k = input.readLine().toInt()
        array[k] += 1
    }
    for (i in 1..10000) {
        for (j in 1..array[i]) {
            output.append(i.toString())
            output.newLine()
        }
    }
    output.flush()
    output.close()
}