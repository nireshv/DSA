package org.uncledroid.dsa.string


//https://leetcode.com/problems/is-subsequence/
//Easy

private fun main() {
    val s = "abc"
    val t = "ahbgdc"
    val res = IsSubsequence().isSubsequence(s, t)
    println(res)
}

class IsSubsequence {
    fun isSubsequence(s: String, t: String): Boolean {
        var si = 0

        for (i in t.indices) {
            if (s[si] == t[i]) {
                si++
                if (si == s.length) return true
            }
        }
        return false
    }
}