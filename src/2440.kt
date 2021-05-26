fun main(){
    val i = readLine()!!.toInt()
    var line = 1
    while (line <= i) {
        println("*".repeat(i - line + 1))
        line += 1
    }
}