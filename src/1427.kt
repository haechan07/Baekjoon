fun main() {
    val listing = mutableListOf<Int>()
    val input = readLine()!!
    input.forEach{
        listing.add(Character.getNumericValue(it))
    }
    listing.sortDescending()
    println(listing.joinToString(""))
}