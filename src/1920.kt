fun main() {
    val N = readLine()!!.toInt()
    val set = hashSetOf<Int>()
    val ns = readLine()!!.split(" ")
    for (i in 0 until N) {
        set.add(ns[i].toInt())
    }
    val m = readLine()!!.toInt()
    val ms = readLine()!!.split(" ")
    val list = mutableListOf<Int>()
    for (i in 0 until m) {
        list.add(ms[i].toInt())
    }
    for (i in list.indices) {
        if (list[i] in set) {
            println(1)
        } else {
            println(0)
        }
    }
}