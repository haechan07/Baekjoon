fun main() {
    val TC = readLine()!!.toInt()
    for (TCs in 1..TC) {
        var calc = 0
        val i = readLine()!!
        var isFalse = false
        for (count in 0..i.lastIndex) {
            i.forEach {
                when (it) {
                    '(' -> calc += 1
                    ')' -> calc -= 1
                }
                if (calc < 0) {
                    isFalse = true
                }
            }
        }
        if (isFalse) {
            println("NO")
        } else {
            if (calc > 0) {
                println("NO")
            } else {
                println("YES")
            }
        }
    }
}