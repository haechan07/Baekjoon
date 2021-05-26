fun main() {
    val T = readLine()!!.toInt()
    for (i in 1..T) {
        val input = readLine()!!.split(" ")
        val A = input[0].toInt()
        val B = input[1].toInt()
        println(A * B / getAnswer(A, B))
    }
}

fun getAnswer(quo : Int, rest : Int) : Int {
    return if (rest == 0) {
        quo
    } else {
        getAnswer(rest, quo % rest)
    }
}