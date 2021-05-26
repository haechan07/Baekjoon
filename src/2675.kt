fun main() {
    var count = readLine()!!.toInt()
    while (count != 0) {
        count -= 1
        val input = readLine()!!.split(" ")
        val times = input[0].toInt()
        val text = input[1]
        for (i in text.indices) {
            var editTimes = times
            while (editTimes != 0) {
                editTimes -= 1
                print(text[i])
            }
        }
        print("\n")
    }
}