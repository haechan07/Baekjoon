import java.lang.StringBuilder

fun main() {
    val i = readLine()!!.toInt()
    val sb = StringBuilder()
    val list = MutableList(0){0}
    for (n in 0 until i) {
        list.add(readLine()!!.toInt())
    }
    list.sort()
    for (n in 0 until i) {
        sb.append(list[n]).append("\n")
    }
    println(sb)
}