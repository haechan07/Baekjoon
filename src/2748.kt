var fibonacci = mutableListOf<Long>(0, 1, 1)

fun main() {
    val n = readLine()!!.toInt()
    if (n in 0..2) {
        println(fibonacci[n])
    } else {
        for (j in 3..n) {
            fibonacci(j)
        }
        println(fibonacci[n])
    }
}

fun fibonacci(index : Int) {
    fibonacci.add(fibonacci[index - 1] + fibonacci[index - 2])
}