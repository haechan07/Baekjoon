fun main() {
    val count = readLine()!!.toInt()
    val sc = readLine()!!
    var temp = 0
    var count2  = 0
    while (count != count2) {
        val temp2 : String = sc[count2].toString()
        val temp3 : Int = temp2.toInt()
        count2 += 1
        temp += temp3
    }
    println(temp)
}