fun main() {
    var price = readLine()!!.toInt()
    for (i in 1..9) {
        price -= readLine()!!.toInt()
    }
    println(price)
}