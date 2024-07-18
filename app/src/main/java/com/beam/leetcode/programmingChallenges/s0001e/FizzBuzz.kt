package com.beam.leetcode.programmingChallenges.s0001e

class FizzBuzz {

    fun solve(n: Int): String {
        if (n < 1 || n > 100) return ""

        var result = ""

        for (i in 1..n) {
            result += when {
                i % 3 == 0 && i % 5 == 0 -> "fizzbuzz\n"
                i % 3 == 0 -> "fizz\n"
                i % 5 == 0 -> "buzz\n"
                else -> "$i\n"
            }
        }
        return result
    }
}