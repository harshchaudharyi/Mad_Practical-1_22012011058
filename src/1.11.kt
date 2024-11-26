class Matrix(private val matrix: Array<IntArray>, private val rows: Int, private val cols: Int) {
    operator fun plus(other: Matrix): Matrix {
        val result = Array(rows) { IntArray(cols) }
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result[i][j] = this.matrix[i][j] + other.matrix[i][j]
            }
        }
        return Matrix(result, rows, cols)
    }
    operator fun minus(other: Matrix): Matrix {
        val result = Array(rows) { IntArray(cols) }
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result[i][j] = this.matrix[i][j] - other.matrix[i][j]
            }
        }
        return Matrix(result, rows, cols)
    }
    operator fun times(other: Matrix): Matrix {
        val result = Array(this.rows) { IntArray(other.cols) }
        for (i in 0 until this.rows) {
            for (j in 0 until other.cols) {
                for (k in 0 until this.cols) {
                    result[i][j] += this.matrix[i][k] * other.matrix[k][j]
                }
            }
        }
        return Matrix(result, this.rows, other.cols)
    }
    override fun toString(): String {
        return matrix.joinToString(separator = "\n") { it.joinToString(separator = " ") }
    }
}
fun main() {
    val firstMatrix = Matrix(arrayOf(intArrayOf(3, -2, 5), intArrayOf(3, 0, 4)), 2, 3)
    val secondMatrix = Matrix(arrayOf(intArrayOf(2, 3), intArrayOf(-9, 0), intArrayOf(0, 4)), 3, 2)
    val secondMatrix1 = Matrix(arrayOf(intArrayOf(6, 3), intArrayOf(9, 0), intArrayOf(5, 4)), 3, 2)

    println("***************Addition**************")
    print("Matrix 1:\n$secondMatrix1\n")
    print("Matrix 2:\n$secondMatrix\n")
    val thirdMatrix = secondMatrix1 + secondMatrix
    println("Addition:\n$thirdMatrix")

    println("***************Subtraction**************")
    print("Matrix 1:\n$secondMatrix1\n")
    print("Matrix 2:\n$secondMatrix\n")
    val subtractMatrix = secondMatrix1 - secondMatrix
    println("Subtraction:\n$subtractMatrix")

    println("***************Multiplication**************")
    print("Matrix 1:\n$firstMatrix\n")
    print("Matrix 2:\n$secondMatrix\n")
    val multiplication = firstMatrix * secondMatrix
    println("Multiplication:\n$multiplication")
}
