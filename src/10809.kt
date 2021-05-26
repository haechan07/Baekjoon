fun main() {
    val i = readLine()!!
    var arr = Array<Int>(26){-1}
    for (charIndex in 97..122) {
        arr[charIndex - 97] = i.indexOf(charIndex.toChar().toString())
    }
    println(arr.joinToString(" "))
}