fun main() {
    val list = readLine()!!.split("-")
    val list2 = mutableListOf<Int>()
    var result = 0
    for (i in list.indices) {
        val k = list[i].split("+")
        var res = 0
        for (j in k.indices) {
            res += k[j].toInt()
        }
        list2.add(res)
    }
    result += list2[0]
    for (i in 1 until list2.size) {
        result -= list2[i]
    }
    println(result)
}