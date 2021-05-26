fun main() {
    var maxIndex = 0
    var max = 0
    for (index in 1..9) {
        val i = readLine()!!
        if (i.toInt() > max) {
            max = i.toInt()
            maxIndex = index
        }
    }
    println(max)
    println(maxIndex)
}