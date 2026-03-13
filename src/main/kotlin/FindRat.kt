package org.uncledroid

import kotlin.math.ceil
import kotlin.math.ln

fun log2(x: Double): Double {
    return (ln(x) / ln(2.0))
}

// Function to find the minimum number of rats
fun minRats(n: Double): Int {
    val log2 = ceil(log2(n))
    println("log2($n) = $log2")
    return (log2).toInt()
}

// Driver Code
fun main(args: Array<String>) {
    // Number of bottles
    val n = 8.0

    println("Minimum " + minRats(n) + " rat(s) are required")
}