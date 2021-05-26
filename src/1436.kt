fun main() {
    val N = readLine()!!.toInt()
    var count = 0
    var num = 665
    while (count != N) {
        num++
        if (num.toString().contains("666")) {
            count++
        }
    }
    println(num)
}