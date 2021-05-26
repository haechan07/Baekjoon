fun main() {
    val list : MutableList<Int> = readLine()!!.split(" ").map {it.toInt()}.toMutableList()
    list.remove(list.minOrNull())
    list.remove(list.maxOrNull())
    println(list[0])
}