fun main() {
    var sum = 0
    val num1 = 2
    val i = readLine()!!
    
    i.forEach {
        when(it.toInt()) {
            in 65..67 -> sum += (num1 + 1)
            in 68..70 -> sum += (num1 + 2)
            in 71..73 -> sum += (num1 + 3)
            in 74..76 -> sum += (num1 + 4)
            in 77..79 -> sum += (num1 + 5)
            in 80..83 -> sum += (num1 + 6)
            in 84..86 -> sum += (num1 + 7)
            in 87..90 -> sum += (num1 + 8)
        }
    }
    println(sum)
}