import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var count = br.readLine().toInt()
    while (count != 0) {
        count -= 1
        val arr = br.readLine().split(" ")
        val first = arr[0].toInt()
        val second = arr[1].toInt()
        bw.write("${first + second}")
        if (count != 0){
            bw.newLine()
        }
    }
    bw.flush()
}
