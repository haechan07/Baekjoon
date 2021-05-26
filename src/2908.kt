fun main() {
    val i = readLine()!!.split(" ")
    var a : Int = i[0].toInt()
    var b : Int = i[1].toInt()
    
    a = a.toString().reversed().toInt()
    b = b.toString().reversed().toInt()
    val result = a.coerceAtLeast(b)
    println(result)
}