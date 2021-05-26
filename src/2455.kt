import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = BufferedWriter(OutputStreamWriter(System.out))

var max = 0
var sum = 0

fun main() {
    for (i in 1..4) {
        val input = StringTokenizer(br.readLine())
        val outcome = input.nextToken().toInt()
        val income = input.nextToken().toInt()
        sum += income
        sum -= outcome
        if (sum > max) {
            max = sum
        }
    }
    bw.write(max.toString())
    bw.flush()
    bw.close()
}