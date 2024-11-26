import java.util.Arrays
fun main() {
    val array1 = arrayOf(1, 2, 3, 4, 5, 6, 7)
    val array2 = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6))
    println("Using Arrays.deepToString(): ${Arrays.deepToString(array2)}")
    println("Using contentDeepToString(): ${array1.contentDeepToString()}")
    val intArray = intArrayOf(10, 20, 30, 40)
    println("Using IntArray.joinToString(): ${intArray.joinToString()}")
    println("Using range:")
    for (i in 0..array1.size - 1) {
        print("${array1[i]} ")
    }
    println()
    println("Using downTo:")
    for (i in array1.size - 1 downTo 0) {
        print("${array1[i]} ")
    }
    println()
    println("Using until:")
    for (i in 0 until array1.size) {
        print("${array1[i]} ")
    }
    println()
    println("Sorting without using built-in functions:")
    val unsortedArray = intArrayOf(25, 22, 21, 24)
    for (i in 0 until unsortedArray.size) {
        for (j in i + 1 until unsortedArray.size) {
            if (unsortedArray[i] > unsortedArray[j]) {
                val temp = unsortedArray[i]
                unsortedArray[i] = unsortedArray[j]
                unsortedArray[j] = temp
            }
        }
    }
    println(unsortedArray.joinToString())
    val unsortedArray2 = intArrayOf(25, 22, 21, 24)
    println("Sorting with built-in functions:")
    unsortedArray2.sort()
    println(unsortedArray2.joinToString())
}
