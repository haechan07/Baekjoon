import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    while (true) {
        println(sc.nextLine())
        if (!sc.hasNextLine()) {
            sc.close()
            break
        }
    }
}