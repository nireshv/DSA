package org.uncledroid.dsa.array

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
//Easy

fun main() {
    val arr = intArrayOf(1,1,2)
    val size = RemoveDuplicateSortedArray().removeDuplicates(arr)
    println("Size=$size")
    for (i in 0..<size) {
        print(arr[i])
    }
}

class RemoveDuplicateSortedArray {
    fun removeDuplicates(nums: IntArray): Int {
        var writePtr = 1
        for (i in 1..<nums.size) {
            if (nums[i-1] != nums[i]){
                nums[writePtr] = nums[i]
                writePtr++
            }
        }
        return writePtr
    }
}