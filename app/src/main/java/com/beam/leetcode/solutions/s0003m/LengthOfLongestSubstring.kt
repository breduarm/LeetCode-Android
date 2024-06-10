package com.beam.leetcode.solutions.s0003m

import kotlin.math.max

class LengthOfLongestSubstring {

    fun solve(s: String): Int {
        val history = mutableMapOf<Char, Int>().withDefault{ _ -> -1 }
        var result = 0
        var leftIndex = 0
        var rightIndex = 0

        while (rightIndex < s.length) {
            val prevIndex = history.getValue(s[rightIndex])
            history[s[rightIndex]] = rightIndex
            if (prevIndex >= leftIndex) {
                leftIndex = prevIndex + 1
            } else {
                result = max(result, rightIndex - leftIndex + 1)
            }
            rightIndex++
        }

        return result
    }
}