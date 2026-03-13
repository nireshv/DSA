package org.uncledroid.dsa.array


//https://leetcode.com/problems/increasing-triplet-subsequence/description/
//Medium

private fun main() {
    val arr = intArrayOf(2,1,5,0,4,6)
    println(arr.toList())
    val res = IncreasingTriplet().increasingTriplet(arr)
    println(res)
}

private class IncreasingTriplet {
    fun increasingTriplet(nums: IntArray): Boolean {
        var first = Int.MAX_VALUE
        var second = Int.MAX_VALUE
        for (num in nums) {
            if (num <= first) {
                first = num
            } else if (num <= second) {
                second = num
            } else {
                return true
            }
        }
        return false
    }
}