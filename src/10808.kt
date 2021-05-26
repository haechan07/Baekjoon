fun main() {
    val input = readLine()!!
    val arr = Array(26){ 0 }

    input.forEach {
        arr[it.toInt() - 97]++
    }
    println(arr.joinToString(" "))
}