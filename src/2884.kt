import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    var h = sc.nextInt()
    var m = sc.nextInt()
    when (true) {
        h <= 0 && m < 45 -> {h = 23; m = 60 - (45 - m)}
        m >= 45 -> m -= 45
        m < 45 && h > 0 -> {h -= 1; m = 60 -(45 - m)}
    }
    println("${h} ${m}")
}