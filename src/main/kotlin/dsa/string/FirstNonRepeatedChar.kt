package org.uncledroid.dsa.string

fun main() {
    val string = "swiss"
    val char = FirstNonRepeatedChar().firstNonRepeatedChar(string)
    println("""First Non Repeated Char in "$string" : $char""")
}

class FirstNonRepeatedChar {
    fun firstNonRepeatedChar(string: String): Char {
        val map = string.groupBy { it }.mapValues { it.value.size }

        map.forEach { (ch, count) ->
            if (count == 1) {
                return ch
            }
        }
        return ' '
    }
}