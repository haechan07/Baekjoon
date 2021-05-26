fun main() {
    val count = readLine()!!.toInt()
    val i = readLine()!!.split(" ")
    var sum = 0
    for (index in 0 until count) {
        var isPrime = true
        when (i[index].toInt()) {
            1 -> continue
            2 -> {sum += 1
                isPrime = false}
            else -> for (j in 2 until i[index].toInt()) {
                if (i[index].toInt() % j == 0) {
                    isPrime = false
                    break
                }
            }
        }
        if (isPrime) {
            sum += 1
        }
    }
    println(sum)
}