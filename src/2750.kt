fun main() {
    val count = readLine()!!.toInt()
    val array = arrayOfNulls<Int?>(count)
    for (i in 0 until count) {
        val input = readLine()!!.toInt()
        array[i] = input
    }
    array.sort()
    for (i in 0 until count) {
        println(array[i])
    }
}
