import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`).nextInt()
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    for (i : Int in 0..8) {
        println("${input} * ${list.get(i)} = ${input * list.get(i)}")
    }
}