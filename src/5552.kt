fun main() {
    var sum = 0
    for (i in 0 until 5) {
        sum += readLine()!!.toInt()
    }
    println(sum)
}