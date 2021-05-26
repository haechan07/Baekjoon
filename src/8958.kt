fun main() {
    var count = readLine()!!.toInt()
    while (count > 0) {
        var sum = 0
        count -= 1
        val i = readLine()!!.split("X")
        for (index in 0..i.lastIndex) {
            if (i[index] != "") {
                val l = i[index].length
                for (j in 1..l) {
                    sum += j
                }
            }
        }
        println(sum)
    }
}