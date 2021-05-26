import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()

    val res1 = (a + b) % c
    val res2 = ((a % c) + (b % c)) % c
    val res3 = (a * b) % c
    val res4 = ((a % c) * (b % c)) % c
    println(res1)
    println(res2)
    println(res3)
    println(res4)
}