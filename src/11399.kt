fun main() {
    val humans = readLine()!!.toInt()
    var list = mutableListOf<Int>()
    val input = readLine()!!.split(" ")
    var sum = 0
    for (i in 0 until humans) {
        list.add(input[i].toInt())
    }
    list = list.sortedDescending().toMutableList()
    for (i in 0 until humans) {
        sum += list[i]
        var varI = i
        while (varI > 0) {
            sum += list[i]
            varI -= 1
        }
    }
    println(sum)
}