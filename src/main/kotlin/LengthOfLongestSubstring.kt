package com.habibi

import kotlin.math.max

fun runLengthOfLongestSubstring() {
    printTestCase(
        lengthOfLongestSubstring("abcabcbb"),
        lengthOfLongestSubstring("bbbbb"),
        lengthOfLongestSubstring("pwwkew"),
    )
}

fun lengthOfLongestSubstring(s: String): Int {
    var subSeq = ""
    var result = 0
    s.forEach {
        if (subSeq.contains(it)) {
            result = max(result, subSeq.length)
            subSeq = subSeq.substringAfter(it)
        }
        subSeq += it
    }

    return max(result, subSeq.length)
}