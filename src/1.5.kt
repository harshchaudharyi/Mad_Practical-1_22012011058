fun main() {
    print("Enter a month number (1-12): ")
    val num = readln().toInt()
    val name = when (num) {
        1 -> "January"
        2 -> "February"
        3 -> "March"
        4 -> "April"
        5 -> "May"
        6 -> "June"
        7 -> "July"
        8 -> "August"
        9 -> "September"
        10 -> "October"
        11 -> "November"
        12 -> "December"
        else -> "Invalid month number"
    }
    println("Month: $name")
}
