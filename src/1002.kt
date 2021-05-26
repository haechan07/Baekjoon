import kotlin.math.*

fun main() {
    val T = readLine()!!.toInt() // 케이스 수 입력
    for (i in 0 until T) { // 반복문
        val input = readLine()!!.split(" ") // 입력
        val (x1, y1, r1) = input.subList(0, 3).map { it.toInt() } // 3개씩 변수 추가
        val (x2, y2, r2) = input.subList(3, 6).map { it.toInt() } // 3개씩 변수 추가
        val distance = sqrt((x1 - x2).toDouble().pow(2) + (y1- y2).toDouble().pow(2)) // 원의 중심 간의 거리
        when {
            (x1 == x2 && y1 == y2 && r1 == r2) -> println(-1) // 같은 원일 경우 교점 무수히 많음 -> -1 출력
            (abs(r1 - r2).toDouble() < distance && distance < (r1 + r2).toDouble()) -> println(2) // 반지름 차 < 거리 < 반지름 합일 경우 두 점에서 만남
            (abs(r1 - r2).toDouble() == distance || (r1 + r2).toDouble() == distance) -> println(1) // 반지름 차 == 거리(내접) or 반지름 합 == 거리(외접) -> 접함
            else -> println(0) // 귀찮으니 else문
        }
    }
}