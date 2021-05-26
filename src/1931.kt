import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val conf = br.readLine().toInt()
    val list = mutableListOf<Pair<Int, Int>>()
    var count = 0
    var endTime = 0

    for (i in 0 until conf) {
        val input = br.readLine().split(" ")
        list.add(Pair(input[0].toInt(), input[1].toInt()))
    }
    list.sortBy { it.first }
    list.sortBy { it.second }

    for (i in 0 until conf) {
        if (list[i].first >= endTime) {
            endTime = list[i].second
            count++
        }
    }
    println(count)
}