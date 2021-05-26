fun main() {
    val input = readLine()!!.split(" ")
    val A = input[0].toInt()
    val I = input[1].toInt()
    println(A * (I - 1) + 1)
}