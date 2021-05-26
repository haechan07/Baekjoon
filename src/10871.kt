import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    val n = input.nextInt()
    val x = input.nextInt()
    var str : String = ""
    for (i in 1..n) {
        val num = input.nextInt()
        if (num < x) {
            str = "$str$num "
        }
    }
    println(str.substring(0, str.length - 1))
}
