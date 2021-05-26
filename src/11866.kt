import java.lang.StringBuilder

fun main() {
    val input = readLine()!!.split(" ")
    val list = mutableListOf<Int>()
    val N = input[0].toInt()
    val K = input[1].toInt()
    var index = 0
    for (i in 1..N) {
        list.add(i)
    }
    val sb = StringBuilder()
    sb.append("<")
    while (list.size > 1) {
        index = (index + (K - 1)) % list.size
        sb.append(list.removeAt(index)).append(", ")
    }
    sb.append(list.removeAt(0)).append(">")
    println(sb)
}