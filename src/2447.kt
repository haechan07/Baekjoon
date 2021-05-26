import java.lang.StringBuilder
import java.util.*

lateinit var array: Array<Array<String?>>
fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val n = input.nextInt()
    array = Array(n) { arrayOfNulls(n) }
    star(0, 0, n, false)
    val sb = StringBuilder()
    for (i in 0 until n) {
        for (j in 0 until n) {
            sb.append(array[i][j])
        }
        sb.append("\n")
    }
    println(sb)
}

fun star(x: Int, y: Int, n: Int, blank: Boolean) {
    // 공백일 경우
    if (blank) {
        for (i in x until x + n) {
            for (j in y until y + n) {
                array[i][j] = " "
            }
        }
        return
    }

    // 더이상 쪼갤 수 없는 경우
    if (n == 1) {
        array[x][y] = "*"
        return
    }

    /*
       n = 27일 경우 size는 9
       n = 9일 경우 size는 3,
       블록의 한 칸을 담을 변수 size
       count는 별 누적 출력
    */
    val size = n / 3
    var count = 0
    var i = x
    while (i < x + n) {
        var j = y
        while (j < y + n) {
            count++
            if (count == 5) { // 공백일 경우
                star(i, j, size, true)
            } else {
                star(i, j, size, false)
            }
            j += size
        }
        i += size
    }
}