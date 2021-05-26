import kotlin.math.min

fun main() {
    val i = readLine()!!.toInt()
    val RGB = Array(i + 1){Array(4){0}}
    for (count in 0 until i) {
        val input = readLine()!!.split(" ")
        for (rgb in 0 until 3) {
            RGB[count][rgb] = input[rgb].toInt()
        }
    }
    for (count in 1..i) {
        RGB[count][0] += min(RGB[count - 1][1], RGB[count - 1][2])
        RGB[count][1] += min(RGB[count - 1][0], RGB[count - 1][2])
        RGB[count][2] += min(RGB[count - 1][0], RGB[count - 1][1])
    }
    val min = min(min(RGB[i - 1][0], RGB[i - 1][1]), RGB[i - 1][2])
    println(min)
}