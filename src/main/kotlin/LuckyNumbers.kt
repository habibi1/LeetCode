package com.habibi

fun runLuckyNumbers() {
    printTestCase(
        luckyNumbers(arrayOf(intArrayOf(3,7,8), intArrayOf(9,11,13), intArrayOf(15,16,17))),
        luckyNumbers(arrayOf(intArrayOf(1,10,4,2), intArrayOf(9,3,8,7), intArrayOf(15,16,17,12))),
        luckyNumbers(arrayOf(intArrayOf(7,8), intArrayOf(1,2))),
    )
}

//Time complexity = O(N*M)
//Space complexity = O(1)
fun luckyNumbers (matrix: Array<IntArray>): List<Int> {
    matrix.forEachIndexed { index, value ->
        var indexMin = 0
        var valueMin: Int = Int.MAX_VALUE
        value.forEachIndexed { index1, value1 ->
            if (value1 < valueMin) {
                valueMin = value1
                indexMin = index1
            }
        }

        var valueMax: Int = Int.MIN_VALUE
        matrix.forEach {
            if (it[indexMin] > valueMax) {
                valueMax = it[indexMin]
            }
        }

        if (valueMin == valueMax) {
            return listOf(valueMin)
        }
    }

    return listOf<Int>()
}