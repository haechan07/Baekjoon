fun main() {
    val date = readLine()
    val nums = readLine()!!.split(" ")
    var count = 0
    for (i in 0 until nums.size) {
        if (nums[i] == date) {
            count++
        }
    }
    println(count)
}