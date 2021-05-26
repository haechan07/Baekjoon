fun main() {
    val N = readLine()!!.toInt()
    val input = readLine()!!.split(" ")
    var toAdd = 1
    var count = 0


    for (i in 0 until N) {
        if (input[i].toInt() == 1) {
            count += toAdd
            toAdd++
        } else {
            toAdd = 1
        }
    }
    println(count)
}