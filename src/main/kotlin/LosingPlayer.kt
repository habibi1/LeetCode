package com.habibi

fun runLosingPlayer() {
    printTestCase(
        losingPlayer(2, 7),
        losingPlayer(4, 11),
    )
}

fun losingPlayer(x: Int, y: Int): String {
    var isAlice = false
    var valueX = x
    var valueY = y
    while (true) {
        valueX--
        valueY -= 4

        if (valueX < 0 || valueY < 0) {
            return if (isAlice) "Alice" else "Bob"
        } else {
            isAlice = !isAlice
        }
    }
}