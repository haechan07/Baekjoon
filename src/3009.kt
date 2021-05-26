fun main() {
    val list = mutableListOf<Pair<Int, Int>>()
    for (i in 0..2) {
        val input = readLine()!!.split(" ")
        list.add(Pair(input[0].toInt(), input[1].toInt()))
    } // for문 이용하여 페어리스트를 채우며 세 점의 좌표 입력

     val x = when (list[0].first) {
        list[1].first -> list[2].first // 1번째와 2번째 점의 x좌표가 같을시 4번째 점의 x좌표는 3번째 점의 것
        list[2].first -> list[1].first // 1번째와 3번째 점의 x좌표가 같을시 4번째 점의 x좌표는 2번째 점의 것
        else -> list[0].first // 2번째와 3번째 점의 x좌표가 같을시 4번째 점의 x좌표는 1번째 점의 것
    }

    val y = when (list[0].second) {
        list[1].second -> list[2].second // 1번째와 2번째 점의 y좌표가 같을시 4번째 점의 y좌표는 3번째 점의 것
        list[2].second -> list[1].second // 1번째와 3번째 점의 y좌표가 같을시 4번째 점의 y좌표는 2번째 점의 것
        else -> list[0].second // 2번째와 3번째 점의 y좌표가 같을시 4번째 점의 y좌표는 1번째 점의 것
    }
    println("$x $y") // 스트링 템플릿 이용하여 출력
}