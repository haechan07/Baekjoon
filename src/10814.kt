fun main() {
    val N = readLine()!!.toInt()
    val list = mutableListOf<Pair<Int, String>>()
    for (i in 1..N) {
        val (age, name) = readLine()!!.split(" ")
        list.add(Pair(age.toInt(), name))
    }
    val sortedlist = list.sortedBy { pair: Pair<Int, String> -> pair.first }
    for (i in 0 until N) {
        println("${sortedlist[i].first} ${sortedlist[i].second}")
    }
}