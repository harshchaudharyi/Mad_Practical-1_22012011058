fun main() {
    print("Enter a number: ")
    val num = readln().toInt()
    if (num != null && num >= 0) {
        val result = factorial(num)
        println("The factorial of $num is $result")
    } else {
        println("Please enter a valid non-negative integer.")
    }
}
fun factorial(n: Int): Long {
    return if (n == 0 || n == 1) {
        1
    } else {
        n * factorial(n - 1)
    }
}
