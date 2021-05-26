fun main() {
    var toStop = false
    var count = 1
    while(!toStop) {
        val (L, P, V) = readLine()!!.split(" ")
        if (L == "0" && P == "0" && V == "0") {
            toStop = true
        } else {
            if (V.toInt() - P.toInt() * (V.toInt() / P.toInt()) >= L.toInt()) {
                println("Case ${count}: ${L.toInt() * (V.toInt() / P.toInt()) + L.toInt()}")
            } else {
                println("Case ${count}: ${L.toInt() * (V.toInt() / P.toInt()) + V.toInt() - P.toInt() * (V.toInt() / P.toInt())}")
            }
        }
        count++
    }
}