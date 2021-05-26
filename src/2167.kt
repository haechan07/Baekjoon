fun main() {
    val list = mutableListOf<MutableList<Int>>()
    val (N, M) = readLine()!!.split(" ")
    for (i in 0 until N.toInt()) {
        list.add(mutableListOf<Int>())
        val input = readLine()!!.split(" ")
        for (j in 0 until M.toInt()) {
            list[i].add(input[j].toInt())
        }
    }
    val K = readLine()!!.toInt()
    for (time in 0 until K) {
        val (i, j, x, y) = readLine()!!.split(" ")
        var count = 0
        for (k in i.toInt() - 1 until x.toInt()) {
            for (l in j.toInt() - 1 until y.toInt()) {
                count += list[k][l]
            }
        }
        println(count)
    }
}