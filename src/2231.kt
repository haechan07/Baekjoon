fun main() {
    val N = readLine()!!.toInt()
    var num = 1
    var printed = false
    while (num < N) {
        val a = num / 100000
        val b = num % 100000 / 10000
        val c = num % 10000 / 1000
        val d = num % 1000 / 100
        val e = num % 100 / 10
        val f = num % 10
        if (num + a + b + c + d + e + f == N) {
            println(num)
            printed = true
            break
        } else {
            num++
        }
    }
    if (!printed) {
        println(0)
    }
}