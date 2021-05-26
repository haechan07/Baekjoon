fun main() {
    val p1 = readLine()!!.split(" ").map { it.toInt() }
    val p2 = readLine()!!.split(" ").map { it.toInt() }
    var count = 0
    for (i in 0..5) {
        for (j in 0..5) {
            when (p1[i] > p2[j]) {
                true -> count++
            }
        }
    }
    var n = 36
    var count2 = count
    while (n != 0) {
        val t = count2 % n
        count2 = n
        n = t
    }
    println("${count / count2}/${36 / count2}")
}