fun main() {
    val count = readLine()!!.toInt()
    val list = readLine()!!.split(" ")

    var min : Int = list[0].toInt()
    var max : Int = list[0].toInt()
    for (i in 0 until count) {
        if (list[i].toInt() > max) {
            max = list[i].toInt()
        }
        if (list[i].toInt() < min) {
            min = list[i].toInt()
        }
    }
    println("$min $max")
}
