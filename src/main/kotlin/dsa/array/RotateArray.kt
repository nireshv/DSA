package org.uncledroid.dsa.array


//https://leetcode.com/problems/rotate-array/description/
//Medium

fun main() {
    val arr = intArrayOf(1,2,3,4,5,6,7)
    println(arr.toList())
    RotateArray().rotate(arr, 3)
    println(arr.toList())
}

class RotateArray {
    fun rotate(nums: IntArray, k: Int): Unit {
        val r = k % nums.size
        reverse(nums, 0, nums.size-1)
        reverse(nums, 0, r-1)
        reverse(nums, r, nums.size-1)
    }

    //the inbuilt arr.reverse() is not fast enough writing custom function
    fun reverse(nums: IntArray, s: Int, e: Int) {
        var i = s
        var j = e
        while (i < j) {
            val temp = nums[i]
            nums[i++] = nums[j]
            nums[j--] = temp
        }
    }
}