package com.beam.leetcode.programmingChallenges.s0001e

class FizzBuzz {

    fun solve(n: Int): String {
        if (n < 1 || n > 100) return ""

        val result = StringBuilder()

        for (i in 1..n) {
            val strToAppend = when {
                i % 3 == 0 && i % 5 == 0 -> "fizzbuzz"
                i % 3 == 0 -> "fizz"
                i % 5 == 0 -> "buzz"
                else -> i
            }
            result.append("$strToAppend\n")
        }
        return result.toString()
    }
}