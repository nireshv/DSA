package org.uncledroid

fun main() {
    val arr = listOf(1, 2, 3, 3, 4, 3, 3, 1, 1, 2)
    //Expected output is [4, 2, 1, 3]

    // 1. Create a frequency map
    val sortedFreq = arr.groupingBy { it }.eachCount().entries.sortedBy { it.value }.map { it.key }
    println(sortedFreq)
}