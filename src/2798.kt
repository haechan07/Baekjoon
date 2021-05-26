fun main() {
    val input = readLine()!!.split(" ")
    val M = input[0].toInt()
    val N = input[1].toInt()
    val cards = readLine()!!.split(" ")
    var max = 0
    var isN = false
    
    for (i in 0 until M) {
        for (j in (i + 1) until M) {
            for (k in (j + 1) until M) {
                val temp = cards[i].toInt() + cards[j].toInt() + cards[k].toInt()
                if (temp > N) {
                    continue
                }
                if (temp == N) {
                    isN = true
                    println(N)
                    break
                }
                if (temp > max) {
                    max = temp
                }
            }
            if (isN) {
                break
            }
        }
        if (isN) {
            break
        }
    }
    if (!isN) {
        println(max)
    }
}