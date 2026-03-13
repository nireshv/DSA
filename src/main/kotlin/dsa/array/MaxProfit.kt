package org.uncledroid.dsa.array

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
//Easy


fun main() {
    val arr = intArrayOf(7,1,5,3,6,4)
    println(arr.toList())
    val profit = MaxProfit().maxProfit(arr)
    println(profit)
}

class MaxProfit {
    fun maxProfit(prices: IntArray): Int {
        var minPrice = prices[0]
        var maxProfit = 0

        for (i in 1 until prices.size) {
            if (prices[i] < minPrice) {
                minPrice = prices[i]
            } else if(prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice
            }
        }

        return maxProfit
    }
}