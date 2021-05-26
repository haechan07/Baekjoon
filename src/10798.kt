import java.lang.StringBuilder

fun main() {
    val sb = StringBuilder()
    val list = mutableListOf<String>()
    for (i in 1..5) {
        list.add(readLine()!!)
    }
    for (i in 0 until 15) {
        for (j in 0 until 5) {
            when (list[j].length - 1 >= i) {
                true -> sb.append(list[j][i])
                false -> continue
            }
        }
    }
    println(sb)
}