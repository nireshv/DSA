package org.uncledroid.dsa.array

//https://leetcode.com/problems/product-of-array-except-self/description/
//Medium

fun main() {
    val arr = intArrayOf(1,2,3,4)
    println(arr.toList())
    val res = ProductExceptSelf().productExceptSelf(arr)
    println(res.toList())
}

class ProductExceptSelf {
    fun productExceptSelf(nums: IntArray): IntArray {
        val res = IntArray(nums.size)

        var temp = 1
        for (i in nums.indices) {
            res[i] = temp
            temp *= nums[i]
        }
        var mul = 1
        for (i in nums.size-1 downTo 0) {
            res[i] *= mul
            mul *= nums[i]
        }
        return  res
    }
}