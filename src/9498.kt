import java.util.Scanner

fun main() {
    val i = Scanner(System.`in`).nextInt()
    when(true) {
        i in 90..100 -> println("A")
        i in 80..89 -> println("B")
        i in 70..79 -> println("C")
        i in 60..69 -> println("D")
        else -> println("F")
    }
}