fun main() {
    val N = readLine()!!.toInt()
    var count = N
    val stu = readLine()!!.split(" ")
    val (B, C) = readLine()!!.split(" ")
    for (i in 1..N) {
        when (stu[i - 1].toInt() - B.toInt() > 0) {
            true -> {
                var num = stu[i - 1].toInt() - B.toInt()
                while (num > 0) {
                    num -= C.toInt()
                    count++
                }
            }
        }
    }
    println(count)
} // 시간 초과