package com.habibi

fun printTestCase(vararg list: IntArray) {
    list.forEach {
        it.forEach { print("$it ") }
        println("")
    }
}

fun printTestCase(vararg list: List<Int>) {
    list.forEach {
        println(it)
    }
}

fun printTestCase(vararg list: Int) {
    list.forEach {
        println(it)
    }
}