fun main() {
    var toCalc = 1000 - (readLine()!!.toInt())
    var count = 0
    while (toCalc != 0) {
        when (true) {
            toCalc / 500 > 0 -> {count += toCalc / 500
                toCalc %= 500}
            toCalc / 100 > 0 -> {count += toCalc / 100
                toCalc %= 100}
            toCalc / 50 > 0 -> {count += toCalc / 50
                toCalc %= 50}
            toCalc / 10 > 0 -> {count += toCalc / 10
                toCalc %= 10}
            toCalc / 5 > 0 -> {count += toCalc / 5
                toCalc %= 5}
            toCalc / 1 > 0 -> {count += toCalc / 1
                toCalc = 0}
        }
    }
    println(count)
}