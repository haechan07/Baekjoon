import java.math.BigInteger

var memo = MutableList<BigInteger?>(1001) {null}

fun main() {
    val i = readLine()!!.toInt()
    val divi = BigInteger("10007")
    var quo = i / 2
    var rest = i % 2
    var sum : BigInteger = BigInteger.ZERO
    while (quo >= 0) {
        sum += factorial2(quo + rest).divide((factorial2(quo) * factorial2(rest)))
        quo -= 1
        rest += 2
    }
    println(sum.mod(divi))
}

fun factorial2(n : Int) : BigInteger {
    var sum : BigInteger = BigInteger.ONE
    return if (memo[n] != null) {
        memo[n]!!
    } else {
        if (n == 0) {
            BigInteger.ONE
        } else {
            for (num in 1..n) {
                sum *= num.toBigInteger()
            }
            memo[n] = sum
            sum
        }
    }
}