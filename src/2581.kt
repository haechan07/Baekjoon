import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val M = br.readLine().toInt()
    val N = br.readLine().toInt()
    val list = mutableListOf<Int>()
    
    for (i in M..N) {
        var isPrime = true
        if (i == 1) {
            isPrime = false
        }
        if (isPrime) {
            for (j in 2 until i) {
                if (i % j == 0) {
                    isPrime = false
                    break
                }
            }
            if (isPrime) {
                list.add(i)
            }
        }
    }
    if (list.isEmpty()) {
        bw.append("-1")
        bw.newLine()
    } else {
        var sum = 0
        for (i in 0..list.lastIndex) {
            sum += list[i]
        }
        bw.append("$sum")
        bw.newLine()
        bw.append(list[0].toString())
    }
    bw.flush()
    bw.close()
}