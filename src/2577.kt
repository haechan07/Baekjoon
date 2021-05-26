fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val result = (a * b * c).toString()
    for (i in 0..9) {
        var count = 0
        for (index in result.indices) {
            if (result[index].toString() == i.toString()) {
                count += 1
            }
        }
        println(count)
    }
}