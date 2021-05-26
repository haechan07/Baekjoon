fun main() {
    val arr = BooleanArray(10001, {false})
    for (i in 1..10001) {
        val n = getN(i)

        if (n <= 10000) {
            arr[n] = true
        }
    }

    for (j in 1..10000) {
        if (!arr[j]) {
            println(j)
        }
    }
}

fun getN(i : Int) : Int {
    var sum = i
    var editI = i

    while (editI != 0) {
        sum += editI % 10
        editI /= 10
    }
    return sum
}