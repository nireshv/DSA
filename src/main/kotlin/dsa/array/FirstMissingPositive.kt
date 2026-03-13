package org.uncledroid.dsa.array

//https://leetcode.com/problems/first-missing-positive/description/
//Hard

private fun main() {
//  val arr = intArrayOf(1,2,0)
//  val arr = intArrayOf(1,2,3)
//  val arr = intArrayOf(3,4,-1,1)
    val arr = intArrayOf(7,8,9,11,12)
    println(arr.toList())
    val res = FirstMissingPositive().firstMissingPositiveOptimized(arr)
    println(res)
}

class FirstMissingPositive {
    fun firstMissingPositiveOptimized(nums: IntArray): Int {
        val boolArray = BooleanArray(nums.size) { false }
        for (i in nums.indices) {
            if (nums[i] > 0 && nums[i] <= nums.size) {
                boolArray[nums[i]-1] = true
            }
        }
        for (i in boolArray.indices) {
            if (!boolArray[i])
                return i+1
        }
        return nums.size+1
    }

    fun firstMissingPositive(nums: IntArray): Int {
        val set = nums.toHashSet()
        for (i in 1..nums.size) {
            if (!set.contains(i)) {
                return i
            }
        }
        return nums.size
    }
}