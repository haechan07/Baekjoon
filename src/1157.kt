fun main() {
    val arr = Array(26){0}
    val i = readLine()!!.toUpperCase()
    for (index in i.indices) {
        for (index2 in 65..90) {
            if (i[index] == index2.toChar()) {
                arr[index2 - 65] += 1
                break
            }
        }
    }
    val arr2 = arr.clone()
    arr2.sortDescending()
    if (arr2[0] == arr2[1]) {
        println("?")
    } else {
        val max : Char = (arr.indexOf(arr2[0]) + 65).toChar()
        println(max)
    }
}