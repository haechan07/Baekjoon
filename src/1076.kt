fun main() {
    val a = readLine()!!
    val b = readLine()!!
    val c = readLine()!!
    println((getValue(a, false) * 10 + getValue(b, false)) * getValue(c, true))
}

fun getValue(color : String, multi : Boolean) : Long {
    val list = listOf("black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white")
    return when (multi) {
        true -> ("1".plus("0".repeat(list.indexOf(color))).toLong())
        false -> list.indexOf(color).toLong()
    }
}