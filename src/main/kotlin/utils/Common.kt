package com.habibi

fun printTestCase(vararg list: IntArray) {
    list.forEach {
        it.forEach { print("$it ") }
        println("")
    }
}