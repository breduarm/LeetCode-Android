package com.beam.leetcode.solutions.s0013e

class RomanToInt {

    fun solve(s: String): Int {
        val map = hashMapOf(
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000,
        )
        var result = 0
        var prevValue = 0

        for (i in s.length - 1 downTo 0) {
            val currentValue = map[s[i]] ?: return -1 // return -1 for invalid input
            if (currentValue < prevValue) {
                result -= currentValue
            } else {
                result += currentValue
            }
            prevValue = currentValue
        }

        return result
    }
}