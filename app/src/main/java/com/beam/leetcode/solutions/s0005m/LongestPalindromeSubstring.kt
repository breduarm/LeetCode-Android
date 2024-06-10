package com.beam.leetcode.solutions.s0005m

import kotlin.math.max

class LongestPalindromeSubstring {

    fun solve(s: String): String {
        if (s.isEmpty()) return ""

        fun expandAroundCenter(s: String, left: Int, right: Int): Int {
            var leftIndex = left
            var rightIndex = right
            while (leftIndex >= 0 && rightIndex < s.length && s[leftIndex] == s[rightIndex]) {
                leftIndex--
                rightIndex++
            }

            return rightIndex - leftIndex -1
        }

        var start = 0
        var end = 0

        for (i in s.indices) {
            val odd = expandAroundCenter(s, i, i)
            val even = expandAroundCenter(s, i, i + 1)
            val maxLength = max(odd, even)

            if (maxLength > end - start) {
                start = i - (maxLength - 1) /2
                end = i + maxLength / 2
            }
        }

        return s.substring(start, end + 1)
    }
}