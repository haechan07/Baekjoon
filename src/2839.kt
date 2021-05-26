fun main() {
    val i = readLine()!!.toInt()
    val quo = i / 5
    val rest = i % 5
    calc(quo, rest)
}

fun calc(quo : Int, rest : Int) {
    var editQuo = quo
    var editRest = rest
    when (true) {
        quo == 0 && (rest % 3) != 0 -> println("-1")
        rest % 3 == 0 -> println(quo + (rest / 3))
        else -> {editQuo -= 1
            editRest += 5
            calc(editQuo, editRest)
        }
    }
}