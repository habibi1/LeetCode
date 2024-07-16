package com.habibi

fun runTwoSum() {
    printTestCase(
        twoSum(intArrayOf(2,7,11,15), 9)
    )
}

// Time Complexity = O(N)
// Space Complexity = O(1)
fun twoSum(nums: IntArray, target: Int): IntArray {
    val result = mutableListOf<Int>()
    val tmp = hashMapOf<Int, Int>()
    nums.forEachIndexed { index, it ->
        val tmp1 = target - it
        if (tmp[tmp1] != null) {
            result.add(tmp[tmp1]!!)
            result.add(index)
        } else {
            tmp[it] = index
        }
    }
    return result.toIntArray()
}