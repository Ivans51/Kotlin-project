import src.Basic

fun main(args: Array<String>) {
    /*basic()*/

    val matrix = arrayOf(
        intArrayOf(11, 2, 4),
        intArrayOf(4, 5, 6),
        intArrayOf(10, 8, -12)
    )

    println(absoluteValor(matrix))
}

private fun absoluteValor(matrix: Array<IntArray>): Int {
    var primarySum = 0
    var secondarySum = 0

    for (i in matrix.indices) {
        for (j in matrix[i].indices) {
            if (i == j) {
                primarySum += matrix[i][j]
            }
            if (i == matrix.size - 1 - j) {
                secondarySum += matrix[i][j]
            }
        }
    }

    return Math.abs(primarySum - secondarySum)
}

private fun basic() {
    val basic = Basic()
    basic.typeData()
    basic.typeCollections()
    println(basic.structureControl(1))

    println("Hello, world!")
    println("It's a sunny and warm day!")
}