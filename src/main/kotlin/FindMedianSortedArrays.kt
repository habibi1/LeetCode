package com.habibi

fun runFindMedianSortedArrays() {
    println(findMedianSortedArrays(intArrayOf(1,3), intArrayOf(2)))
}

fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    val mergedList = (nums1.toList() + nums2.toList()).sorted()
    val size = mergedList.size
    val medianIndex = size / 2

    return if (size % 2 == 0) {
        (mergedList[medianIndex - 1] + mergedList[medianIndex]) / 2.0
    } else {
        mergedList[medianIndex].toDouble()
    }
}