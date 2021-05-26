fun main() {
    val (N, M) = readLine()!!.split(" ")
    val list = mutableListOf<String>()
    for (i in 1..N.toInt()) {
        list.add(readLine()!!)
    }
    for (i in 1..M.toInt()) {
        val input = readLine()!!
        if (input.toIntOrNull() != null) {
            println(list[input.toInt() - 1])
            } else {
                println(list.indexOf(input) + 1)
        }
    }
} // 시간 초과 해결할 것
// 추정 해결책 : 이분탐색