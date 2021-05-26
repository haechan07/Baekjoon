import java.lang.StringBuilder

fun main() {
    val sb = StringBuilder()
    var count = 0
    val (N, M) = readLine()!!.split(" ")
    val noListen = mutableListOf<String>()
    val noSee = mutableListOf<String>()
    for (i in 0 until N.toInt()) {
        noListen.add(readLine()!!)
    }
    for (i in 0 until M.toInt()) {
        noSee.add(readLine()!!)
    }
    for (i in 0 until N.toInt()) {
        when (noSee.contains(noListen[i])) {
            true -> {
                count++
                sb.append(noListen[i])
                sb.append("\n")
            }
        }
    }
    println(count)
    println(sb)
}