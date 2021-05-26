fun main() {
    val list = MutableList(30){ false }
    for (i in 1..28) {
        val j = readLine()!!.toInt()
        list[j - 1] = true
    }
    for (i in 0..29) {
        if (!list[i]) {
            println(i + 1)
        }
    }
}