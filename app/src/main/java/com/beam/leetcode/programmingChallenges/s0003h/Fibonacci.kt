package com.beam.leetcode.programmingChallenges.s0003h

class Fibonacci {

    fun solve(n: Int): String {
        if (n < 1) return ""
        if (n == 1) return "0"

        var first = 0
        var second = 1
        val result = StringBuilder("0, 1,")

        for (i in 2 ..< n) {
            val fibonacci = first + second

            result.append(" $fibonacci,")

            first = second
            second = fibonacci
        }

        result.deleteAt(result.length - 1)

        return result.toString()
    }
}