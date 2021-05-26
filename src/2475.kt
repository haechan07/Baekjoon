import kotlin.math.pow

fun main() {
    val i = readLine()!!.split(" ")
    var sum = 0
    for (j in 0..i.lastIndex) {
        sum += i[j].toDouble().pow(2.0).toInt()
    }
    println(sum % 10)
}