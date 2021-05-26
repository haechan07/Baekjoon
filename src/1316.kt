fun main() {
    val n = readLine()!!.toInt()
    var count = 0
    for (i in 0 until n) {
        val str = readLine()!!
        val charStr = str.toCharArray()
        var flag = true
        for (j in 0 until charStr.size - 1) {
            for (k in j until charStr.size - 1) {
                if (charStr[k] != charStr[j] && charStr[k + 1] == charStr[j]) {
                    flag = false
                    break
                }
            }
            if (!flag) break
        }
        if (flag) count++
    }
    println(count)
}