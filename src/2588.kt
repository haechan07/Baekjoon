fun main() {
    val a = readLine()!!.toInt() // 첫 수 입력
    val i = readLine()!!.toInt() // 두번째 수 입력

    val b = i / 100 // 세번째 수 입력, 100으로 나눴을때의 몫
    val c = (i - b * 100) / 10 // 네번째 수 입력, 백의 자리를 지우고 10으로 나눴을때의 몫
    val d = i % 10 // 다섯번째 수 입력, 10으로 나누고 나머지

    println(a * d) // 일의 자리수와 곱
    println(a * c) // 십의 자리수와 곱
    println(a * b) // 백의 자리수와 곱
    println(a * i) // 두번째 수와 곱
}
