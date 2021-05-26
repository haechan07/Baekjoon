fun main() {
    val (N, K) = readLine()!!.split(" ")
    println(factorial(N.toInt()) / (factorial(K.toInt()) * factorial((N.toInt() - K.toInt()))))
}

fun factorial(n : Int) : Int {
    return if (n == 0 || n == 1) {
        1
    } else {
        n * factorial(n - 1)
    }
}