fun main() {
    while (true) {
        val i = readLine()!!
        if (i != "END") {
            var j = MutableList(0){'n'}
            for (k in 0 until i.length) {
                j.add(i[k])
            }
            j.reverse()
            println(j.joinToString(""))
        } else {
            break
        }
    }
}