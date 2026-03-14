package org.uncledroid.dsa.string


//https://leetcode.com/problems/longest-common-prefix/
//Easy

private fun main() {
    val strs = arrayOf("flower","flow","flight")
    val res = LongestCommonPrefix().longestCommonPrefix(strs)
    println(res)
}

class LongestCommonPrefix {
    fun longestCommonPrefix(strs: Array<String>): String {
        var i = 0
        var res = ""
        while (true) {
            var char = ' '
            for (j in strs.indices) {
                if (i >= strs.size) return res
                if (j == 0) {
                    char = strs[j][i]
                } else if (strs[j][i] != char) return res
            }
            res += char
            i++
        }
    }
}