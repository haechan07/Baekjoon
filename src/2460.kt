fun main() {
    var temp = 0
    var max = 0
    for (i in 0 until 10) {
        val input = readLine()!!.split(" ")
        temp += input[1].toInt() - input[0].toInt()
        if (temp > max) {
            max = temp
        }
    }
    println(max)
}