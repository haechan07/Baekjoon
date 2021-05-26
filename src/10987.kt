fun main() {
    val input = readLine()!!
    var count = 0
    for (i in 0 until input.length) {
        val j = input[i].toInt()
        if (j == 97 || j == 101 || j == 105 || j == 111 || j == 117) {
            count++
        }
    }
    println(count)
}