import java.io.OutputStreamWriter
import java.io.BufferedWriter

fun main() {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val N = readLine()!!.toInt()
    val Ns = readLine()!!.split(" ")
    val M = readLine()!!.toInt()
    val Ms = readLine()!!.split(" ")
    val map = HashMap<String, Int>(N)
    for (i in 0 until N) {
        map.putIfAbsent(Ns[i], 0)
        map.replace(Ns[i], map[Ns[i]]!! + 1)
    }
    for (i in 0 until M) {
        when (map.containsKey(Ms[i])) {
            true -> bw.write("${map[Ms[i]]} ")
            false -> bw.write("0 ")
        }
    }
    bw.flush()
    bw.close()
}