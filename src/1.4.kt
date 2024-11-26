fun main() {
    print("Enter any number: ")
    val a= readln().toInt()
    println(
        if (a != null) {
            if (a % 2 == 0) {
                "$a is an even number."
            } else {
                "$a is an odd number."
            }
        } else {
            "Please enter a valid integer."
        }
    )
}
