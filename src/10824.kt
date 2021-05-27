fun main() {
    val (A, B, C, D) = readLine()!!.split(" ") // A, B, C, D 입력
    val first = A.plus(B).toLong() // A와 B 연결
    val second = C.plus(D).toLong() // C와 D 연결
    println(first + second) // 합 출력
} // 1000000 1000000 1000000 1000000까지 입력이 가능한데 오버플로 가능성이 있으므로 Long 사용