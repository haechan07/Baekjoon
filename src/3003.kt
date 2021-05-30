fun main() {
    val input = readLine()!!.split(" ") // 입력 받기
    var (K, Q, R) = input.subList(0, 3).map { it.toInt() } // 킹 퀸 룩 변수
    var (B, Kn, P) = input.subList(3, 6).map { it.toInt() } // 비숍 나이트 폰 변수
    K = 1 - K // 킹 차이
    Q = 1 - Q // 퀸 차이
    R = 2 - R // 룩 차이
    B = 2 - B // 비숍 차이
    Kn = 2 - Kn // 나이트 차이
    P = 8 - P // 폰 차이
    println("$K $Q $R $B $Kn $P") // 출력 형식에 맞춰 출력
}