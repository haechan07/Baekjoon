fun main() {
    var toGetMin = true
    var count = 0
    var min = 0
    val list = mutableListOf<Int>()
    for (i in 1..7) {
        list.add(readLine()!!.toInt())
    }
    list.sort()
    for (i in 0..6) {
        if (list[i] % 2 == 1) {
            count += list[i]
            if (toGetMin) {
                min = list[i]
                toGetMin = false
            }
        }
    }
    if (toGetMin) {
        println(-1)
    } else {
        println(count)
        println(min)
    }
}