fun main() {
    var hanCount = 0
    val N = readLine()!!.toInt()
    for (i in N downTo 1) {
        val X = i.toString()
        var isHan = true
        if (X.length == 1) {
            hanCount += 1
        } else {
            val temp = X[0].toInt() - X[1].toInt()
            for (j in 0 until X.lastIndex) {
                if (temp != X[j].toInt() - X[j + 1].toInt()) {
                    isHan = false
                }
            }
            if (isHan) {
                hanCount += 1
            }
        }
    }
    println(hanCount)
}