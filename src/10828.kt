fun main() {
    val count = readLine()!!.toInt() // 입력 수
    val stack = mutableListOf<Int>() // 스택의 위쪽은 리스트의 뒤쪽
    for (i in 1..count) { // count 동안
        val input = readLine()!!.split(" ") // push 대비 분리
        when (input[0]) {
            "push" -> stack.add(input[1].toInt()) // push 들어오면 정수를 추가한다
            "pop" -> if (stack.size != 0) { // pop 들어오면 크기 != 0이면 최상단 스택 출력 후 제거, 아니면 -1 출력
                println(stack[stack.lastIndex])
                stack.removeAt(stack.lastIndex)
            } else { // 크기 == 0 이면 -1 출력
                println("-1")
            }
            "size" -> println(stack.size) // size 들어오면 크기 출력
            "empty" -> if (stack.size == 0) { // empty 들어오면 크기가 0이면 1 아니면 0 출력
                println("1")
            } else {
                println("0")
            }
            "top" -> if (stack.size != 0) { // top 들어오면 크기 != 0이면 최상단 스택 출력, 아니면 -1 출력
                println(stack[stack.lastIndex])
            } else {
                println("-1")
            }
        }
    }
}