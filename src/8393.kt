import java.util.Scanner

fun main() {
    val n = Scanner(System.`in`).nextInt()
    var result : Int = 0
    for (i in 1..n) {
        result += i
    }
    println(result)
}