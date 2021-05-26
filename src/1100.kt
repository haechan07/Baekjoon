fun main() {
    var count = 0
    val list = mutableListOf<List<String>>()
    for (i in 1..8) {
        list.add(readLine()!!.split(""))
    }
    for (i in 1..8) {
        when (i % 2) {
            1 -> for (j in 1..7 step 2) {
                if (list[i - 1][j] == "F") {
                    count++
                }
            }
            0 -> for (j in 2..8 step 2) {
                if (list[i - 1][j] == "F") {
                    count++
                }
            }
        }
    }
    println(count)
}