import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    var revCount = sc.nextInt()
    var count = 1
    while (revCount != 0) {
        val a = sc.nextInt()
        val b = sc.nextInt()
        println("Case #${count}: ${a + b}")
        count += 1
        revCount -= 1
    }
}