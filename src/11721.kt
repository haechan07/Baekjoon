fun main() {
    val i = readLine()!!
    val count = (i.lastIndex + 1) / 10
    for (counting in 0 until count) {
        val text = i.substring(counting * 10, counting * 10 + 10)
        println(text)
    }
    println(i.substring(count * 10, i.lastIndex + 1))
}