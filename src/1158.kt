fun main() {
    val (N, K) = readLine()!!.split(" ").map { it.toInt() }
    val list1 = mutableListOf<Int>()
    for (i in 1..N) {
        list1.add(i)
    }
    val list2 = mutableListOf<Int>()
    var i = K - 1
    while (list1.isNotEmpty()) {
        if (i >= list1.size) {
            i %= list1.size
        }
        list2.add(list1.removeAt(i))
        i += K - 1
    }
    println("<".plus(list2.joinToString(", ")).plus(">"))
}