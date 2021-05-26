fun main() {
    val i = readLine()!!.split(" ")
    var isAscend : Boolean? = null

    for (index in 0..6) {
        if ((i[index].toInt() + 1) == i[index + 1].toInt()) {
            isAscend = true
        } else {
            if (i[index].toInt() == (i[index + 1].toInt() + 1)) {
                isAscend = false
            } else {
                isAscend = null
                println("mixed")
                break
            }
        }
    }
    when (isAscend) {
        true -> println("ascending")
        false -> println("descending")
    }
}