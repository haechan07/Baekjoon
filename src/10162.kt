fun main() {
    var T = readLine()!!.toInt() // T 입력
    when (T % 10) {
        0 -> { val A = T / 300 // 300으로 나눈 몫울 A에 대입
            T %= 300 // 300으로 나눈 나머지를 T에 대입
            val B = T / 60 // 60으로 나눈 몫을 B에 대입
            T %= 60 // 60으로 나눈 나머지를 T에 대입
            val C = T / 10 // 10으로 나눈 몫을 C에 대입
            println("$A $B $C") // 출력 형식에 맞춰 출력
        }
        else -> println(-1) // 일의 자리가 0이 아닐 경우 -1 출력
    }
}