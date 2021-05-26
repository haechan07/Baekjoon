fun main() {
    val date = readLine()!!.split(" ")
    val month = date[0].toInt()
    val dateList = listOf("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT")
    var sum = 0
    for (i in (month - 1) downTo 1) {
        if ((i % 2 == 1 && i <= 7) || (i % 2 == 0 && i >= 8)) {
            sum += 31
        } else {
            if (i == 2) {
                sum += 28
            } else {
                if ((i % 2 == 0 && i <= 7) || (i % 2 == 1 && i >= 8))
                    sum += 30
            }
        }
    }
    sum += date[1].toInt()
    println(dateList[sum % 7])
}
