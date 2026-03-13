package org.uncledroid.dsa.string

//https://leetcode.com/problems/valid-palindrome/
//Easy

private fun main() {
    val s = "A man, a plan, a canal: Panama"
//    val s = "0P"
    println(s)
    val res = IsPalindrome().isPalindromeOptimized(s)
    println(res)
}

class IsPalindrome {
    fun isPalindromeOptimized(s: String): Boolean {
        var start = 0
        var end = s.length-1
        while (start < end) {
            while (start < end && !s[start].isLetterOrDigit()) start++
            while (start < end && !s[end].isLetterOrDigit()) end--

            if (!isEqualIgnoreCase(s[start++], s[end--])) {
                return false
            }
        }
        return true
    }

    fun isEqualIgnoreCase(c1: Char, c2: Char) = c1.lowercaseChar() == c2.lowercaseChar()

    fun isPalindrome(s: String): Boolean {
        val cleanS = buildString {
            for (i in s.indices) {
                if (s[i] >= 'a' && s[i] <= 'z' || s[i] >= '0' && s[i] <= '9') {
                    append(s[i])
                } else if (s[i] >= 'A' && s[i] <= 'Z') {
                    append(s[i]+0X20)
                }
            }
        }
        println(cleanS)
        var s = 0
        var e = cleanS.length-1
        while (s < e) {
            if (cleanS[s++] != cleanS[e--]) {
                return false
            }
        }
        return true
    }

}