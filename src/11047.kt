val input = readLine()!!.split(" ")
val N = input[0].toInt()
val K = input[1].toInt()
var worthList = MutableList(0){0}
var sum2 = 0

fun main() {
    for (i in 0 until N) {
        val worth = readLine()!!.toInt()
        if (worth > K) {
            break
        }
        worthList.add(worth)
    }
    calc(K)
    println(sum2)
}

fun calc(K : Int) {
    val quo = K / (worthList.maxOrNull()!!)
    val rest = K % (worthList.maxOrNull()!!)
    val toDelete = mutableListOf<Int>()
    for (i in 0..worthList.lastIndex) {
        if (worthList[i] > rest) {
            toDelete.add(worthList[i])
        }
    }
    for (i in 0..toDelete.lastIndex) {
        worthList.remove(toDelete[i])
    }
    sum2 += quo
    if (rest != 0) {
        calc(rest)
    }
}