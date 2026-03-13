package org.uncledroid.dsa.array

//https://leetcode.com/problems/move-zeroes/description/
//Easy


fun main() {

    val arr = intArrayOf(0,1,0,3,12)
    println(arr.toList())
    MoveZeroToLast().moveZeroesOptimized(arr)
    println(arr.toList())

}

class MoveZeroToLast {
    fun moveZeroesInplaceSwap(nums: IntArray): Unit {
        var write = 0
        for (i in 0 ..< nums.size) {
            if (nums[i] != 0) {
                if (i != write) {
                    val temp = nums[i]
                    nums[i] = nums[write]
                    nums[write] = temp
                }
                write++
            }
        }
    }

    fun moveZeroesOptimized(nums: IntArray): Unit {
        var write = 0
        for (i in 0 ..< nums.size) {
            if (nums[i] != 0) {
                nums[write++] = nums[i]
            }
        }
        for (i in write ..< nums.size) {
            nums[i] = 0
        }
    }
}