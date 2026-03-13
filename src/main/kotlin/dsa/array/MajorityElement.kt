package org.uncledroid.dsa.array

//https://leetcode.com/problems/majority-element/description/
//https://algomaster.io/learn/dsa/majority-element
//Easy


fun main() {
    val arr = intArrayOf(2,2,1,1,1,2,2)
    println(arr.toList())
    val res = MajorityElement().majorityElement(arr)
    println(res)
}

class MajorityElement {
    fun majorityElement(nums: IntArray): Int {
        var candidate = nums[0]
        var count = 0
        for (num in nums) {
            if (count == 0) {
                candidate = num
            }
            count += if (num == candidate) 1 else -1
        }
        return candidate
    }
}