import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    val a = input.nextInt()
    val b = input.nextInt()

    val plus = a + b
    val minus = a - b
    val multiply = a * b
    val divide = a / b
    val left = a % b
    println("${plus}\n${minus}\n${multiply}\n${divide}\n${left}")
}