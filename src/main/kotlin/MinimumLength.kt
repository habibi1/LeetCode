package com.habibi

fun runMinimumLength() {
    printTestCase(
        minimumLength("abaacbcbb"),
        minimumLength("aa"),
    )
}

fun minimumLength(s: String): Int {
    var result = 0
    val tmp = mutableMapOf<Char, Int>()
    s.forEach {
        if (tmp[it] != null) {
            val tmpValue = tmp[it]!!+1
            tmp[it] = tmpValue
            if (tmpValue % 2 == 0) {
                result++
            } else {
                result--
            }
        } else {
            result++
            tmp[it] = 1
        }
    }
    return result
}