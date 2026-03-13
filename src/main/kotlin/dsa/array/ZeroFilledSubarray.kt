package org.uncledroid.dsa.array

//https://leetcode.com/problems/number-of-zero-filled-subarrays/description/
//Medium

private fun main() {
    val arr = intArrayOf(0,0,0,2,0,0)
    println(arr.toList())
    val res = ZeroFilledSubarray().zeroFilledSubarrayOptimized(arr)
    println(res)
}

private class ZeroFilledSubarray {
    fun zeroFilledSubarray(nums: IntArray): Long {
        var res = 0L
        var count = 0L
        for (i in nums.indices) {
            if (nums[i] == 0) {
                count++
            } else {
                res += (count*(count+1)/2)
                count = 0
            }
        }
        res += (count*(count+1)/2)
        return res
    }

    fun zeroFilledSubarrayOptimized(nums: IntArray): Long {
        var sum = 0L
        var count = 0L
        for (i in nums.indices) {
            if (nums[i] == 0) {
                count++
                sum += count
            } else {
                count = 0
            }
        }
        return sum
    }

}

