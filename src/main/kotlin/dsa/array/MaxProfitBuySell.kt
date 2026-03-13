package org.uncledroid.dsa.array

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
//Medium

private fun main() {
    val arr = intArrayOf(7,1,5,3,6,4)
    println(arr.toList())
    val res = MaxProfitBuySell().maxProfit(arr)
    println(res)
}

private class MaxProfitBuySell {
    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0
        for (i in 1..<prices.size) {
            val profit = prices[i] - prices[i-1]
            if (profit > 0) maxProfit += profit
        }
        return maxProfit
    }
}