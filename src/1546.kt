fun main() {
    val count = readLine()!!.toInt()
    val arr = readLine()!!.split(" ").toMutableList()
    var sum = 0.0
    var max = arr[0].toDouble()
    for (i in arr.indices){
        if (arr[i].toDouble() > max) {
            max = arr[i].toDouble()
        }
    }
    for (i in arr.indices) {
        arr[i] = ((arr[i].toDouble() / max) * 100).toString()
        sum += arr[i].toDouble()
    }
    println(sum / count)
}