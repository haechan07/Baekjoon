fun main() {
    val input = readLine()!!.split(" ")
    val a = input[0].toInt()
    val b = input[1].toInt()
    val euclid = euclid(a, b)
    println(euclid)
    println(a * b / euclid)
}

fun euclid(quo : Int, rest : Int): Int {
    return if (rest == 0) {
        quo
    } else {
        euclid(rest, quo % rest)
    }
}