fun main() {
    while (true) {
        val list = mutableListOf(0, 0, 0, 0)
        val str = readLine() ?: break
        for (element in str) {
            when (element.toInt()) {
                32 -> list[3]++
                in 48..57 -> list[2]++
                in 65..90 -> list[1]++
                in 97..122 -> list[0]++
            }
        }
        println(list.joinToString(" "))
    }
}